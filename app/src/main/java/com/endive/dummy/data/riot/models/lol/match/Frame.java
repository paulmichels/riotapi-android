package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class Frame {

    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("participantFrames")
    @Expose
    private HashMap<String, ParticipantFrame> participantFrames;
    @SerializedName("events")
    @Expose
    private List<Event> events;

    public long getTimestamp() {
        return timestamp;
    }

    public HashMap<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public List<Event> getEvents() {
        return events;
    }
}
