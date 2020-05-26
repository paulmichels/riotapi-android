package com.endive.dummy.ui;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.endive.dummy.R;
import com.endive.dummy.adapters.SummonerAdapter;
import com.endive.dummy.databinding.ActivityMainBinding;
import com.endive.dummy.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private ActivityMainBinding binding;

    private final View.OnClickListener addSummonerClickListener =
            (view) -> showEditTextDialog(getString(R.string.enter_summoner_name));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);

        binding.addSummonerLayout.setOnClickListener(addSummonerClickListener);

        binding.summonerList.setLayoutManager(new LinearLayoutManager(this));
        binding.summonerList.setAdapter(new SummonerAdapter(viewModel.getAllSummoners()));
        binding.summonerList.setNestedScrollingEnabled(false);
    }

    private void showEditTextDialog(String title){
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setCancelable(true);
        alertDialog.setTitle(title);
        final EditText editText = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMarginEnd(48);
        layoutParams.setMarginStart(48);
        editText.setLayoutParams(layoutParams);
        InputFilter[] filterArray = new InputFilter[1];
        filterArray[0] = new InputFilter.LengthFilter(16);
        editText.setFilters(filterArray);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, this.getString(R.string.ok),
                (dialog, which) -> viewModel.getSummonerByName(editText.getText().toString())
        );
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, this.getString(R.string.cancel),
                (dialog, which) -> alertDialog.dismiss()
        );
        FrameLayout container = new FrameLayout(this);
        container.addView(editText);
        alertDialog.setView(container);
        alertDialog.show();
    }

}
