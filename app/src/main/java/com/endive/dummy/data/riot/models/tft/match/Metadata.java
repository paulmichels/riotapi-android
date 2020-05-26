package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Metadata {

    @Expose
    @SerializedName("data_version")
    private String dataVersion;

    @Expose
    @SerializedName("match_id")
    private String matchId;

    @Expose
    @SerializedName("participant")
    private List<Participant> participant;

    public String getDataVersion() {
        return dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public List<Participant> getParticipant() {
        return participant;
    }
}
