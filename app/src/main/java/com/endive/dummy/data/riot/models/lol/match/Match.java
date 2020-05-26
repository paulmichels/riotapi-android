package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Match {

    @SerializedName("seasonId")
    @Expose
    private long seasonId;
    @SerializedName("queueId")
    @Expose
    private long queueId;
    @SerializedName("gameId")
    @Expose
    private long gameId;
    @SerializedName("participantIdentities")
    @Expose
    private List<ParticipantIdentity> participantIdentities;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
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
    @SerializedName("teams")
    @Expose
    private List<Team> teams;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("gameDuration")
    @Expose
    private long gameDuration;
    @SerializedName("gameCreation")
    @Expose
    private long gameCreation;

    public long getSeasonId() {
        return seasonId;
    }

    public long getQueueId() {
        return queueId;
    }

    public long getGameId() {
        return gameId;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public String getGameVersion() {
        return gameVersion;
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

    public List<Team> getTeams() {
        return teams;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setSeasonId(long seasonId) {
        this.seasonId = seasonId;
    }

    public void setQueueId(long queueId) {
        this.queueId = queueId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public void setGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }
}