package com.endive.dummy.data.riot.models.lol.league;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MiniSeries {

    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("target")
    @Expose
    private long target;
    @SerializedName("progress")
    @Expose
    private String progress;

    public long getWins() {
        return wins;
    }

    public long getLosses() {
        return losses;
    }

    public long getTarget() {
        return target;
    }

    public String getProgress() {
        return progress;
    }
}
