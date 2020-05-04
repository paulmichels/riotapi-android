package com.endive.dummy.model.spectator;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentGameInfo {

    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("gameStartTime")
    @Expose
    private Long gameStartTime;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("mapId")
    @Expose
    private Long mapId;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameQueueConfigId")
    @Expose
    private Long gameQueueConfigId;
    @SerializedName("observers")
    @Expose
    private Observers observers;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("gameLength")
    @Expose
    private Long gameLength;
    @SerializedName("bannedChampions")
    @Expose
    private List<FeaturedGames.BannedChampion> bannedChampions;

    public Long getGameId() {
        return gameId;
    }

    public Long getGameStartTime() {
        return gameStartTime;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public Long getMapId() {
        return mapId;
    }

    public String getGameType() {
        return gameType;
    }

    public Long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public Observers getObservers() {
        return observers;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public Long getGameLength() {
        return gameLength;
    }

    public List<FeaturedGames.BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public static class BannedChampion {

        @SerializedName("teamId")
        @Expose
        private Long teamId;
        @SerializedName("championId")
        @Expose
        private Long championId;
        @SerializedName("pickTurn")
        @Expose
        private Long pickTurn;

        public Long getTeamId() {
            return teamId;
        }

        public Long getChampionId() {
            return championId;
        }

        public Long getPickTurn() {
            return pickTurn;
        }
    }

    public static class Observers {

        @SerializedName("encryptionKey")
        @Expose
        private String encryptionKey;

        public String getEncryptionKey() {
            return encryptionKey;
        }
    }

    public static class Participant {

        @SerializedName("profileIconId")
        @Expose
        private Long profileIconId;
        @SerializedName("championId")
        @Expose
        private Long championId;
        @SerializedName("summonerName")
        @Expose
        private String summonerName;
        @SerializedName("gameCustomizationObjects")
        @Expose
        private List<Object> gameCustomizationObjects;
        @SerializedName("bot")
        @Expose
        private Boolean bot;
        @SerializedName("perks")
        @Expose
        private Perks perks;
        @SerializedName("spell2Id")
        @Expose
        private Long spell2Id;
        @SerializedName("teamId")
        @Expose
        private Long teamId;
        @SerializedName("spell1Id")
        @Expose
        private Long spell1Id;
        @SerializedName("summonerId")
        @Expose
        private String summonerId;

        public Long getProfileIconId() {
            return profileIconId;
        }

        public Long getChampionId() {
            return championId;
        }

        public String getSummonerName() {
            return summonerName;
        }

        public List<Object> getGameCustomizationObjects() {
            return gameCustomizationObjects;
        }

        public Boolean getBot() {
            return bot;
        }

        public Perks getPerks() {
            return perks;
        }

        public Long getSpell2Id() {
            return spell2Id;
        }

        public Long getTeamId() {
            return teamId;
        }

        public Long getSpell1Id() {
            return spell1Id;
        }

        public String getSummonerId() {
            return summonerId;
        }
    }

    public static class Perks {

        @SerializedName("perkStyle")
        @Expose
        private Long perkStyle;
        @SerializedName("perkIds")
        @Expose
        private List<Long> perkIds;
        @SerializedName("perkSubStyle")
        @Expose
        private Long perkSubStyle;

        public Long getPerkStyle() {
            return perkStyle;
        }

        public List<Long> getPerkIds() {
            return perkIds;
        }

        public Long getPerkSubStyle() {
            return perkSubStyle;
        }
    }

}