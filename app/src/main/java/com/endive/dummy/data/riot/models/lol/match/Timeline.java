package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Timeline {

    @SerializedName("lane")
    @Expose
    private String lane;
    @SerializedName("participantId")
    @Expose
    private long participantId;
    @SerializedName("csDiffPerMinDeltas")
    @Expose
    private Map<String, Double> csDiffPerMinDeltas;
    @SerializedName("goldPerMinDeltas")
    @Expose
    private Map<String, Double> goldPerMinDeltas;
    @SerializedName("xpDiffPerMinDeltas")
    @Expose
    private Map<String, Double> xpDiffPerMinDeltas;
    @SerializedName("creepsPerMinDeltas")
    @Expose
    private Map<String, Double> creepsPerMinDeltas;
    @SerializedName("xpPerMinDeltas")
    @Expose
    private Map<String, Double> xpPerMinDeltas;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("damageTakenDiffPerMinDeltas")
    @Expose
    private Map<String, Double> damageTakenDiffPerMinDeltas;
    @SerializedName("damageTakenPerMinDeltas")
    @Expose
    private Map<String, Double> damageTakenPerMinDeltas;

    public String getLane() {
        return lane;
    }

    public long getParticipantId() {
        return participantId;
    }

    public Map<String, Double> getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public Map<String, Double> getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public Map<String, Double> getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public Map<String, Double> getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public Map<String, Double> getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public String getRole() {
        return role;
    }

    public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    public Map<String, Double> getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }
}
