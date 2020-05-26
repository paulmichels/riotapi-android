package com.endive.dummy.data.riot.models.lol.clash;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TournamentPhase {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("registrationTime")
    @Expose
    private long registrationTime;

    @SerializedName("startTime")
    @Expose
    private long startTime;

    @SerializedName("cancelled")
    @Expose
    private boolean cancelled;

    public int getId() {
        return id;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }
}
