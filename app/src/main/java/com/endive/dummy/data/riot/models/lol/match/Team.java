package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {

    @SerializedName("firstDragon")
    @Expose
    private boolean firstDragon;
    @SerializedName("bans")
    @Expose
    private List<Ban> bans = null;
    @SerializedName("firstInhibitor")
    @Expose
    private boolean firstInhibitor;
    @SerializedName("win")
    @Expose
    private String win;
    @SerializedName("firstRiftHerald")
    @Expose
    private boolean firstRiftHerald;
    @SerializedName("firstBaron")
    @Expose
    private boolean firstBaron;
    @SerializedName("baronKills")
    @Expose
    private long baronKills;
    @SerializedName("riftHeraldKills")
    @Expose
    private long riftHeraldKills;
    @SerializedName("firstBlood")
    @Expose
    private boolean firstBlood;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("firstTower")
    @Expose
    private boolean firstTower;
    @SerializedName("vilemawKills")
    @Expose
    private long vilemawKills;
    @SerializedName("inhibitorKills")
    @Expose
    private long inhibitorKills;
    @SerializedName("towerKills")
    @Expose
    private long towerKills;
    @SerializedName("dominionVictoryScore")
    @Expose
    private long dominionVictoryScore;
    @SerializedName("dragonKills")
    @Expose
    private long dragonKills;

    public boolean getFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public boolean getFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public boolean getFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public boolean getFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public long getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(long baronKills) {
        this.baronKills = baronKills;
    }

    public long getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(long riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public boolean getFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public boolean getFirstTower() {
        return firstTower;
    }

    public void setFirstTower(boolean firstTower) {
        this.firstTower = firstTower;
    }

    public long getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(long vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public long getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(long towerKills) {
        this.towerKills = towerKills;
    }

    public long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(long dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public long getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(long dragonKills) {
        this.dragonKills = dragonKills;
    }

}
