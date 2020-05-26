package com.endive.dummy.data.riot.models.lol.champion;

import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChampionInfo {
    @SerializedName("freeChampionIds")
    @Expose
    private List<Long> freeChampionIds;
    @SerializedName("freeChampionIdsForNewPlayers")
    @Expose
    private List<Long> freeChampionIdsForNewPlayers;
    @SerializedName("maxNewPlayerLevel")
    @Expose
    private long maxNewPlayerLevel;

    public List<Long> getFreeChampionIds() {
        return freeChampionIds;
    }

    public List<Long> getFreeChampionIdsForNewPlayers() {
        return freeChampionIdsForNewPlayers;
    }

    public long getMaxNewPlayerLevel() {
        return maxNewPlayerLevel;
    }

    public List<Long> getFreeChampions(Summoner summoner){
        if(summoner.getSummonerLevel() < maxNewPlayerLevel){
            return freeChampionIdsForNewPlayers;
        }
        return freeChampionIds;
    }
}
