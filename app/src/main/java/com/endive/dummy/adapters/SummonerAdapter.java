package com.endive.dummy.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import com.endive.dummy.R;
import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.endive.dummy.data.riot.repository.SummonerRepository;
import com.endive.dummy.databinding.ItemSummonerBinding;
import com.endive.dummy.ui.HomeActivity;

import java.util.List;
import java.util.Objects;

public class SummonerAdapter extends RecyclerView.Adapter<SummonerAdapter.SummonerViewHolder> {

    private LiveData<List<Summoner>> summonerList;

    private Observer<List<Summoner>> listObserver = listApiModel -> notifyDataSetChanged();

    public SummonerAdapter(LiveData<List<Summoner>> summonerList) {
        this.summonerList = summonerList;
        this.summonerList.observeForever(listObserver);
    }

    @NonNull
    @Override
    public SummonerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_summoner, parent, false);
        return new SummonerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SummonerViewHolder holder, int position) {
        holder.setItem((Objects.requireNonNull(summonerList.getValue()).get(position)));
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull SummonerViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public void onViewAttachedToWindow(@NonNull SummonerViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public boolean onFailedToRecycleView(@NonNull SummonerViewHolder holder) {
        holder.itemView.clearAnimation();
        return super.onFailedToRecycleView(holder);
    }

    @Override
    public int getItemCount() {
        if (summonerList.getValue() != null) {
            return summonerList.getValue().size();
        }
        return 0;
    }

    @Override
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.summonerList.removeObserver(listObserver);
        this.summonerList = null;
    }

    static class SummonerViewHolder extends RecyclerView.ViewHolder {

        private ItemSummonerBinding binding;

        private final View.OnClickListener itemOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), HomeActivity.class);
                intent.putExtra(v.getContext().getString(R.string.extra_summoner_account_id), binding.getSummoner().getAccountId());
                v.getContext().startActivity(intent);
            }
        };

        private final View.OnClickListener deleteOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SummonerRepository(v.getContext()).deleteByName(binding.getSummoner().getName());
            }
        };

        SummonerViewHolder(View view) {
            super(view);
            bind();
        }

        void bind() {
            if (binding == null) {
                binding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (binding != null) {
                binding.unbind();
            }
        }

        void setItem(Summoner item) {
            if (binding != null) {
                binding.setSummoner(item);
                binding.getRoot().setOnClickListener(itemOnClickListener);
                binding.deleteSummonerButton.setOnClickListener(deleteOnClickListener);
            }
        }
    }
}