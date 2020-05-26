package com.endive.dummy.data.riot.models.lol.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameList {

    @SerializedName("gameId")
    @Expose
    private long gameId;
    @SerializedName("gameStartTime")
    @Expose
    private long gameStartTime;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("mapId")
    @Expose
    private long mapId;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameQueueConfigId")
    @Expose
    private long gameQueueConfigId;
    @SerializedName("observers")
    @Expose
    private Observers observers;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("gameLength")
    @Expose
    private long gameLength;
    @SerializedName("bannedChampions")
    @Expose
    private List<BannedChampion> bannedChampions;

    public long getGameId() {
        return gameId;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public long getMapId() {
        return mapId;
    }

    public String getGameType() {
        return gameType;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public Observers getObservers() {
        return observers;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public long getGameLength() {
        return gameLength;
    }

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }
}
