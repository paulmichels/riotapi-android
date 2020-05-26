package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Participant {

    @Expose
    @SerializedName("companion")
    private Companion companion;

    @Expose
    @SerializedName("gold_left")
    private int goldLeft;

    @Expose
    @SerializedName("last_round")
    private int lastRound;

    @Expose
    @SerializedName("level")
    private int level;

    @Expose
    @SerializedName("placement")
    private int placement;

    @Expose
    @SerializedName("players_eliminated")
    private int playersEliminated;

    @Expose
    @SerializedName("puuid")
    private String puuid;

    @Expose
    @SerializedName("time_eliminated")
    private float timeEliminated;

    @Expose
    @SerializedName("total_damage_to_players")
    private int totalDamageToPlayers;

    @Expose
    @SerializedName("traits")
    private List<Trait> traits;

    @Expose
    @SerializedName("units")
    private List<Unit> units;

    public Companion getCompanion() {
        return companion;
    }

    public int getGoldLeft() {
        return goldLeft;
    }

    public int getLastRound() {
        return lastRound;
    }

    public int getLevel() {
        return level;
    }

    public int getPlacement() {
        return placement;
    }

    public int getPlayersEliminated() {
        return playersEliminated;
    }

    public String getPuuid() {
        return puuid;
    }

    public float getTimeEliminated() {
        return timeEliminated;
    }

    public int getTotalDamageToPlayers() {
        return totalDamageToPlayers;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public List<Unit> getUnits() {
        return units;
    }
}
