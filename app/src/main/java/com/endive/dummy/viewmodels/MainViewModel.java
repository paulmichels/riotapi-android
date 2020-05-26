package com.endive.dummy.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.endive.dummy.data.riot.repository.SummonerRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private SummonerRepository summonerRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        summonerRepository = new SummonerRepository(application);
    }

    public LiveData<Summoner> getSummonerByName(String name){
        return summonerRepository.getByName(name);
    }

    public LiveData<List<Summoner>> getAllSummoners() {
        return summonerRepository.getAll();
    }
}
