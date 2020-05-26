package com.endive.dummy.data.riot.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.endive.dummy.data.riot.database.RiotDatabase;
import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.SummonerService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class SummonerRepository {

    private RiotDatabase database;

    public SummonerRepository(final Context context) {
        this.database = RiotDatabase.getDatabase(context);
    }

    public LiveData<Summoner> getByName(String name) {
        LiveData<Summoner> result = database.summonerDao().getSummonerByName(name);
        RiotApi.getInstance().create(SummonerService.class).getByName(RiotApi.EUW1, name).enqueue(new Callback<Summoner>() {
            @Override
            @EverythingIsNonNull
            public void onResponse(Call<Summoner> call, Response<Summoner> response) {
                RiotDatabase.databaseWriteExecutor.execute(() -> {
                    database.summonerDao().insert(response.body());
                });
            }

            @Override
            @EverythingIsNonNull
            public void onFailure(Call<Summoner> call, Throwable t) {

            }
        });
        return result;
    }

    public void deleteByName(String name){
        RiotDatabase.databaseWriteExecutor.execute(() -> {
            database.summonerDao().deleteByName(name);
        });
    }

    public LiveData<List<Summoner>> getAll(){
        return database.summonerDao().getAll();
    }

}
