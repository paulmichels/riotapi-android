package com.endive.dummy.model.clash;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tournament {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("themeId")
    @Expose
    private int themeId;

    @SerializedName("nameKey")
    @Expose
    private String nameKey;

    @SerializedName("nameKeySecondary")
    @Expose
    private String nameKeySecondary;

    @SerializedName("schedule")
    @Expose
    private List<TournamentPhase> schedule;

    public int getId() {
        return id;
    }

    public int getThemeId() {
        return themeId;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getNameKeySecondary() {
        return nameKeySecondary;
    }

    public List<TournamentPhase> getSchedule() {
        return schedule;
    }

    public static class TournamentPhase{

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
}
