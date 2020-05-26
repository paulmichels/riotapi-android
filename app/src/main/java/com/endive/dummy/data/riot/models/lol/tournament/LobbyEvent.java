package com.endive.dummy.data.riot.models.lol.tournament;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LobbyEvent {

    @SerializedName("summonerId")
    @Expose
    private String summonerId;

    @SerializedName("eventType")
    @Expose
    private String eventType;

    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    public String getSummonerId() {
        return summonerId;
    }

    public String getEventType() {
        return eventType;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
