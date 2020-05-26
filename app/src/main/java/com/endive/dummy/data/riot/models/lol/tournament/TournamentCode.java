package com.endive.dummy.data.riot.models.lol.tournament;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TournamentCode {

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("spectators")
    @Expose
    private String spectators;

    @SerializedName("lobbyName")
    @Expose
    private String lobbyName;

    @SerializedName("metaData")
    @Expose
    private String metaData;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("teamSize")
    @Expose
    private int teamSize;

    @SerializedName("providerId")
    @Expose
    private int providerId;

    @SerializedName("pickType")
    @Expose
    private String pickType;

    @SerializedName("tournamentId")
    @Expose
    private int tournamentId;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("map")
    @Expose
    private String map;

    @SerializedName("participants")
    @Expose
    private String[] participants;

    public String getCode() {
        return code;
    }

    public String getSpectators() {
        return spectators;
    }

    public String getLobbyName() {
        return lobbyName;
    }

    public String getMetaData() {
        return metaData;
    }

    public String getPassword() {
        return password;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public int getProviderId() {
        return providerId;
    }

    public String getPickType() {
        return pickType;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public int getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public String getMap() {
        return map;
    }

    public String[] getParticipants() {
        return participants;
    }
}
