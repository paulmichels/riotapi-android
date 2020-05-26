package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParticipantIdentity {

    @SerializedName("player")
    @Expose
    private Player player;
    @SerializedName("participantId")
    @Expose
    private long participantId;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

}
