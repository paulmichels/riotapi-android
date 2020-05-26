package com.endive.dummy.data.riot.models.lol.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedGames {

    @SerializedName("clientRefreshInterval")
    @Expose
    private long clientRefreshInterval;
    @SerializedName("gameList")
    @Expose
    private List<GameList> gameList;

    public long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public List<GameList> getGameList() {
        return gameList;
    }

}
