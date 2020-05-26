package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchList {

    @SerializedName("matches")
    @Expose
    private List<Match> matches;
    @SerializedName("endIndex")
    @Expose
    private long endIndex;
    @SerializedName("startIndex")
    @Expose
    private long startIndex;
    @SerializedName("totalGames")
    @Expose
    private long totalGames;

    public List<Match> getMatches() {
        return matches;
    }

    public long getEndIndex() {
        return endIndex;
    }

    public long getStartIndex() {
        return startIndex;
    }

    public long getTotalGames() {
        return totalGames;
    }

    public static class Match {

        @SerializedName("lane")
        @Expose
        private String lane;
        @SerializedName("gameId")
        @Expose
        private long gameId;
        @SerializedName("champion")
        @Expose
        private long champion;
        @SerializedName("platformId")
        @Expose
        private String platformId;
        @SerializedName("timestamp")
        @Expose
        private long timestamp;
        @SerializedName("queue")
        @Expose
        private long queue;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("season")
        @Expose
        private long season;

        public String getLane() {
            return lane;
        }

        public long getGameId() {
            return gameId;
        }

        public long getChampion() {
            return champion;
        }

        public String getPlatformId() {
            return platformId;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public long getQueue() {
            return queue;
        }

        public String getRole() {
            return role;
        }

        public long getSeason() {
            return season;
        }
    }

}
