package com.endive.dummy.data.riot.models.lol.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannedChampion {

    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("pickTurn")
    @Expose
    private long pickTurn;

    public long getTeamId() {
        return teamId;
    }

    public long getChampionId() {
        return championId;
    }

    public long getPickTurn() {
        return pickTurn;
    }
}
