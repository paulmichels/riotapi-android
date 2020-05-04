package com.endive.dummy.model.league;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeagueList {

    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("leagueId")
    @Expose
    private String leagueId;
    @SerializedName("entries")
    @Expose
    private List<LeagueEntry> entries;
    @SerializedName("queue")
    @Expose
    private String queue;
    @SerializedName("name")
    @Expose
    private String name;

    public String getTier() {
        return tier;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public List<LeagueEntry> getEntries() {
        return entries;
    }

    public String getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

    public static class LeagueEntry{
        @SerializedName("summonerName")
        @Expose
        private String summonerName;
        @SerializedName("hotStreak")
        @Expose
        private Boolean hotStreak;
        @SerializedName("wins")
        @Expose
        private Long wins;
        @SerializedName("veteran")
        @Expose
        private Boolean veteran;
        @SerializedName("losses")
        @Expose
        private Long losses;
        @SerializedName("rank")
        @Expose
        private String rank;
        @SerializedName("inactive")
        @Expose
        private Boolean inactive;
        @SerializedName("freshBlood")
        @Expose
        private Boolean freshBlood;
        @SerializedName("summonerId")
        @Expose
        private String summonerId;
        @SerializedName("leaguePoints")
        @Expose
        private Long leaguePoints;

        public String getSummonerName() {
            return summonerName;
        }

        public Boolean getHotStreak() {
            return hotStreak;
        }

        public Long getWins() {
            return wins;
        }

        public Boolean getVeteran() {
            return veteran;
        }

        public Long getLosses() {
            return losses;
        }

        public String getRank() {
            return rank;
        }

        public Boolean getInactive() {
            return inactive;
        }

        public Boolean getFreshBlood() {
            return freshBlood;
        }

        public String getSummonerId() {
            return summonerId;
        }

        public Long getLeaguePoints() {
            return leaguePoints;
        }
    }
}
