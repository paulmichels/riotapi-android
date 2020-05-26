package com.endive.dummy.data.riot.models.lol.tournament;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LobbyEventWrapper {

    @SerializedName("eventList")
    @Expose
    private List<LobbyEvent> eventList;

    public List<LobbyEvent> getEventList() {
        return eventList;
    }
}
