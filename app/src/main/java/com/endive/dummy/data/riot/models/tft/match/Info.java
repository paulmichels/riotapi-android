package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Info {

    @Expose
    @SerializedName("game_datetime")
    private String gameDatetime;

    @Expose
    @SerializedName("game_length")
    private String gameLength;

    @Expose
    @SerializedName("game_version")
    private String gameVersion;

    @Expose
    @SerializedName("participants")
    private List<Participant> participants;

    @Expose
    @SerializedName("queue_id")
    private int queueId;

    @Expose
    @SerializedName("tft_set_number")
    private int tftSetNumber;

    public String getGameDatetime() {
        return gameDatetime;
    }

    public String getGameLength() {
        return gameLength;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public int getQueueId() {
        return queueId;
    }

    public int getTftSetNumber() {
        return tftSetNumber;
    }
}
