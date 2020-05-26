package com.endive.dummy.data.riot.models.lor.ranked;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leaderboard {

    @SerializedName("players")
    @Expose
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }
}
