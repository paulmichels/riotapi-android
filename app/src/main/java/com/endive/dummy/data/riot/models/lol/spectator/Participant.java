package com.endive.dummy.data.riot.models.lol.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Participant {

    @SerializedName("profileIconId")
    @Expose
    private long profileIconId;
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("gameCustomizationObjects")
    @Expose
    private List<Object> gameCustomizationObjects;
    @SerializedName("bot")
    @Expose
    private boolean bot;
    @SerializedName("perks")
    @Expose
    private Perks perks;
    @SerializedName("spell2Id")
    @Expose
    private long spell2Id;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("spell1Id")
    @Expose
    private long spell1Id;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;

    public long getProfileIconId() {
        return profileIconId;
    }

    public long getChampionId() {
        return championId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public List<Object> getGameCustomizationObjects() {
        return gameCustomizationObjects;
    }

    public boolean getBot() {
        return bot;
    }

    public Perks getPerks() {
        return perks;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public long getTeamId() {
        return teamId;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public String getSummonerId() {
        return summonerId;
    }
}
