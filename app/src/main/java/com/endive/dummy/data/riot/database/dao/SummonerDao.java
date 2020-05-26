package com.endive.dummy.data.riot.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.endive.dummy.data.riot.models.lol.summoner.Summoner;

import java.util.List;

@Dao
public interface SummonerDao extends BaseDao<Summoner> {

    @Query("SELECT * FROM Summoner ORDER BY accountId ASC")
    LiveData<List<Summoner>> getAll();

    @Query("SELECT * FROM Summoner WHERE name =:name")
    LiveData<Summoner> getSummonerByName(String name);

    @Query("DELETE FROM Summoner WHERE name =:name")
    int deleteByName(String name);
}
