package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParticipantFrame {

    @SerializedName("totalGold")
    @Expose
    private long totalGold;
    @SerializedName("teamScore")
    @Expose
    private long teamScore;
    @SerializedName("participantId")
    @Expose
    private long participantId;
    @SerializedName("level")
    @Expose
    private long level;
    @SerializedName("currentGold")
    @Expose
    private long currentGold;
    @SerializedName("minionsKilled")
    @Expose
    private long minionsKilled;
    @SerializedName("dominionScore")
    @Expose
    private long dominionScore;
    @SerializedName("position")
    @Expose
    private Position position;
    @SerializedName("xp")
    @Expose
    private long xp;
    @SerializedName("jungleMinionsKilled")
    @Expose
    private long jungleMinionsKilled;

    public long getTotalGold() {
        return totalGold;
    }

    public long getTeamScore() {
        return teamScore;
    }

    public long getParticipantId() {
        return participantId;
    }

    public long getLevel() {
        return level;
    }

    public long getCurrentGold() {
        return currentGold;
    }

    public long getMinionsKilled() {
        return minionsKilled;
    }

    public long getDominionScore() {
        return dominionScore;
    }

    public Position getPosition() {
        return position;
    }

    public long getXp() {
        return xp;
    }

    public long getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }
}
