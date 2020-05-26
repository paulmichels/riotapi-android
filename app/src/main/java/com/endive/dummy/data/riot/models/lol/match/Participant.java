package com.endive.dummy.data.riot.models.lol.match;

import android.content.Context;

import com.endive.dummy.util.RiotJsonUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

public class Participant {

    @SerializedName("spell1Id")
    @Expose
    private long spell1Id;
    @SerializedName("participantId")
    @Expose
    private long participantId;
    @SerializedName("timeline")
    @Expose
    private Timeline timeline;
    @SerializedName("spell2Id")
    @Expose
    private long spell2Id;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("championId")
    @Expose
    private long championId;

    public long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public String getChampionImageUrl(Context context){
        try {
            return "http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + RiotJsonUtils.getChampionName(context, getChampionId()) + ".png";
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
