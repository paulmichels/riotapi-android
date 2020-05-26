package com.endive.dummy.data.riot.models.lol.league;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeagueList {

    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("leagueId")
    @Expose
    private String leagueId;
    @SerializedName("entries")
    @Expose
    private List<LeagueEntry> entries;
    @SerializedName("queue")
    @Expose
    private String queue;
    @SerializedName("name")
    @Expose
    private String name;

    public String getTier() {
        return tier;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public List<LeagueEntry> getEntries() {
        return entries;
    }

    public String getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

}
