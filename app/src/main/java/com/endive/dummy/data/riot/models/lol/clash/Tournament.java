package com.endive.dummy.data.riot.models.lol.clash;

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

}
