package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {

    @SerializedName("itemId")
    @Expose
    private long itemId;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("participantId")
    @Expose
    private long participantId;
    @SerializedName("skillSlot")
    @Expose
    private long skillSlot;
    @SerializedName("levelUpType")
    @Expose
    private String levelUpType;
    @SerializedName("afterId")
    @Expose
    private long afterId;
    @SerializedName("beforeId")
    @Expose
    private long beforeId;
    @SerializedName("killerId")
    @Expose
    private long killerId;
    @SerializedName("victimId")
    @Expose
    private long victimId;
    @SerializedName("assistingParticipantIds")
    @Expose
    private List<Long> assistingParticipantIds;
    @SerializedName("position")
    @Expose
    private Position position;

    public long getItemId() {
        return itemId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public long getParticipantId() {
        return participantId;
    }

    public long getSkillSlot() {
        return skillSlot;
    }

    public String getLevelUpType() {
        return levelUpType;
    }

    public long getAfterId() {
        return afterId;
    }

    public long getBeforeId() {
        return beforeId;
    }

    public long getKillerId() {
        return killerId;
    }

    public long getVictimId() {
        return victimId;
    }

    public List<Long> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    public Position getPosition() {
        return position;
    }
}
