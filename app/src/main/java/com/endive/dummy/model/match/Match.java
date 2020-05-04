package com.endive.dummy.model.match;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.endive.dummy.util.RiotJsonUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

import java.util.List;


public class Match {

    @SerializedName("seasonId")
    @Expose
    private Long seasonId;
    @SerializedName("queueId")
    @Expose
    private Long queueId;
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("participantIdentities")
    @Expose
    private List<ParticipantIdentity> participantIdentities;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
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
    @SerializedName("teams")
    @Expose
    private List<Team> teams;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("gameDuration")
    @Expose
    private Long gameDuration;
    @SerializedName("gameCreation")
    @Expose
    private Long gameCreation;

    public Long getSeasonId() {
        return seasonId;
    }

    public Long getQueueId() {
        return queueId;
    }

    public Long getGameId() {
        return gameId;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public String getGameVersion() {
        return gameVersion;
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

    public List<Team> getTeams() {
        return teams;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public Long getGameDuration() {
        return gameDuration;
    }

    public Long getGameCreation() {
        return gameCreation;
    }

    //TODO
    public ParticipantIdentity getParticipantIdentityBySummonerId(String summonerId){
        for (ParticipantIdentity participant : getParticipantIdentities()) {
            if(participant.player.summonerId.equals(summonerId)){
                return participant;
            }
        }
        return null;
    }

    public ParticipantIdentity getParticipantIdentityByAccountId(String accountId){
        for (ParticipantIdentity participant : getParticipantIdentities()) {
            if(participant.player.accountId.equals(accountId)){
                return participant;
            }
        }
        return null;
    }

    @BindingAdapter("readableQueueType")
    public String getReadableQueueType(TextView textView, Long queueId){
        try {
            return RiotJsonUtils.getQueueDescription(textView.getContext(), queueId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class Ban {

        @SerializedName("pickTurn")
        @Expose
        private Long pickTurn;
        @SerializedName("championId")
        @Expose
        private Long championId;

        public Long getPickTurn() {
            return pickTurn;
        }

        public Long getChampionId() {
            return championId;
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


    public static class CreepsPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get_2030() {
            return _2030;
        }

        public Double get_010() {
            return _010;
        }

        public Double get_1020() {
            return _1020;
        }
    }


    public static class CsDiffPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get_2030() {
            return _2030;
        }

        public void set_2030(Double _2030) {
            this._2030 = _2030;
        }

        public Double get_010() {
            return _010;
        }

        public void set_010(Double _010) {
            this._010 = _010;
        }

        public Double get_1020() {
            return _1020;
        }

        public void set_1020(Double _1020) {
            this._1020 = _1020;
        }
    }


    public static class DamageTakenDiffPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get_2030() {
            return _2030;
        }

        public Double get_010() {
            return _010;
        }

        public Double get_1020() {
            return _1020;
        }
    }


    public static class DamageTakenPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get_2030() {
            return _2030;
        }

        public Double get_010() {
            return _010;
        }

        public Double get_1020() {
            return _1020;
        }
    }


    public static class GoldPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get2030() {
            return _2030;
        }

        public void set2030(Double _2030) {
            this._2030 = _2030;
        }

        public Double get010() {
            return _010;
        }

        public void set010(Double _010) {
            this._010 = _010;
        }

        public Double get1020() {
            return _1020;
        }

        public void set1020(Double _1020) {
            this._1020 = _1020;
        }

    }


    public static class Participant {

        @SerializedName("spell1Id")
        @Expose
        private Long spell1Id;
        @SerializedName("participantId")
        @Expose
        private Long participantId;
        @SerializedName("timeline")
        @Expose
        private Timeline timeline;
        @SerializedName("spell2Id")
        @Expose
        private Long spell2Id;
        @SerializedName("teamId")
        @Expose
        private Long teamId;
        @SerializedName("stats")
        @Expose
        private Stats stats;
        @SerializedName("championId")
        @Expose
        private Long championId;

        public Long getSpell1Id() {
            return spell1Id;
        }

        public void setSpell1Id(Long spell1Id) {
            this.spell1Id = spell1Id;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public void setParticipantId(Long participantId) {
            this.participantId = participantId;
        }

        public Timeline getTimeline() {
            return timeline;
        }

        public void setTimeline(Timeline timeline) {
            this.timeline = timeline;
        }

        public Long getSpell2Id() {
            return spell2Id;
        }

        public void setSpell2Id(Long spell2Id) {
            this.spell2Id = spell2Id;
        }

        public Long getTeamId() {
            return teamId;
        }

        public void setTeamId(Long teamId) {
            this.teamId = teamId;
        }

        public Stats getStats() {
            return stats;
        }

        public void setStats(Stats stats) {
            this.stats = stats;
        }

        public Long getChampionId() {
            return championId;
        }

        public void setChampionId(Long championId) {
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


    public static class ParticipantIdentity {

        @SerializedName("player")
        @Expose
        private Player player;
        @SerializedName("participantId")
        @Expose
        private Long participantId;

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public void setParticipantId(Long participantId) {
            this.participantId = participantId;
        }

    }


    public static class Player {

        @SerializedName("currentPlatformId")
        @Expose
        private String currentPlatformId;
        @SerializedName("summonerName")
        @Expose
        private String summonerName;
        @SerializedName("matchHistoryUri")
        @Expose
        private String matchHistoryUri;
        @SerializedName("platformId")
        @Expose
        private String platformId;
        @SerializedName("currentAccountId")
        @Expose
        private String currentAccountId;
        @SerializedName("profileIcon")
        @Expose
        private Long profileIcon;
        @SerializedName("summonerId")
        @Expose
        private String summonerId;
        @SerializedName("accountId")
        @Expose
        private String accountId;

        public String getCurrentPlatformId() {
            return currentPlatformId;
        }

        public void setCurrentPlatformId(String currentPlatformId) {
            this.currentPlatformId = currentPlatformId;
        }

        public String getSummonerName() {
            return summonerName;
        }

        public void setSummonerName(String summonerName) {
            this.summonerName = summonerName;
        }

        public String getMatchHistoryUri() {
            return matchHistoryUri;
        }

        public void setMatchHistoryUri(String matchHistoryUri) {
            this.matchHistoryUri = matchHistoryUri;
        }

        public String getPlatformId() {
            return platformId;
        }

        public void setPlatformId(String platformId) {
            this.platformId = platformId;
        }

        public String getCurrentAccountId() {
            return currentAccountId;
        }

        public void setCurrentAccountId(String currentAccountId) {
            this.currentAccountId = currentAccountId;
        }

        public Long getProfileIcon() {
            return profileIcon;
        }

        public void setProfileIcon(Long profileIcon) {
            this.profileIcon = profileIcon;
        }

        public String getSummonerId() {
            return summonerId;
        }

        public void setSummonerId(String summonerId) {
            this.summonerId = summonerId;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

    }


    public static class Stats {

        @SerializedName("neutralMinionsKilledTeamJungle")
        @Expose
        private Long neutralMinionsKilledTeamJungle;
        @SerializedName("visionScore")
        @Expose
        private Long visionScore;
        @SerializedName("magicDamageDealtToChampions")
        @Expose
        private Long magicDamageDealtToChampions;
        @SerializedName("largestMultiKill")
        @Expose
        private Long largestMultiKill;
        @SerializedName("totalTimeCrowdControlDealt")
        @Expose
        private Long totalTimeCrowdControlDealt;
        @SerializedName("longestTimeSpentLiving")
        @Expose
        private Long longestTimeSpentLiving;
        @SerializedName("perk1Var1")
        @Expose
        private Long perk1Var1;
        @SerializedName("perk1Var3")
        @Expose
        private Long perk1Var3;
        @SerializedName("perk1Var2")
        @Expose
        private Long perk1Var2;
        @SerializedName("tripleKills")
        @Expose
        private Long tripleKills;
        @SerializedName("perk5")
        @Expose
        private Long perk5;
        @SerializedName("perk4")
        @Expose
        private Long perk4;
        @SerializedName("playerScore9")
        @Expose
        private Long playerScore9;
        @SerializedName("playerScore8")
        @Expose
        private Long playerScore8;
        @SerializedName("kills")
        @Expose
        private Long kills;
        @SerializedName("playerScore1")
        @Expose
        private Long playerScore1;
        @SerializedName("playerScore0")
        @Expose
        private Long playerScore0;
        @SerializedName("playerScore3")
        @Expose
        private Long playerScore3;
        @SerializedName("playerScore2")
        @Expose
        private Long playerScore2;
        @SerializedName("playerScore5")
        @Expose
        private Long playerScore5;
        @SerializedName("playerScore4")
        @Expose
        private Long playerScore4;
        @SerializedName("playerScore7")
        @Expose
        private Long playerScore7;
        @SerializedName("playerScore6")
        @Expose
        private Long playerScore6;
        @SerializedName("perk5Var1")
        @Expose
        private Long perk5Var1;
        @SerializedName("perk5Var3")
        @Expose
        private Long perk5Var3;
        @SerializedName("perk5Var2")
        @Expose
        private Long perk5Var2;
        @SerializedName("totalScoreRank")
        @Expose
        private Long totalScoreRank;
        @SerializedName("neutralMinionsKilled")
        @Expose
        private Long neutralMinionsKilled;
        @SerializedName("statPerk1")
        @Expose
        private Long statPerk1;
        @SerializedName("statPerk0")
        @Expose
        private Long statPerk0;
        @SerializedName("damageDealtToTurrets")
        @Expose
        private Long damageDealtToTurrets;
        @SerializedName("physicalDamageDealtToChampions")
        @Expose
        private Long physicalDamageDealtToChampions;
        @SerializedName("damageDealtToObjectives")
        @Expose
        private Long damageDealtToObjectives;
        @SerializedName("perk2Var2")
        @Expose
        private Long perk2Var2;
        @SerializedName("perk2Var3")
        @Expose
        private Long perk2Var3;
        @SerializedName("totalUnitsHealed")
        @Expose
        private Long totalUnitsHealed;
        @SerializedName("perk2Var1")
        @Expose
        private Long perk2Var1;
        @SerializedName("perk4Var1")
        @Expose
        private Long perk4Var1;
        @SerializedName("totalDamageTaken")
        @Expose
        private Long totalDamageTaken;
        @SerializedName("perk4Var3")
        @Expose
        private Long perk4Var3;
        @SerializedName("wardsKilled")
        @Expose
        private Long wardsKilled;
        @SerializedName("largestCriticalStrike")
        @Expose
        private Long largestCriticalStrike;
        @SerializedName("largestKillingSpree")
        @Expose
        private Long largestKillingSpree;
        @SerializedName("quadraKills")
        @Expose
        private Long quadraKills;
        @SerializedName("magicDamageDealt")
        @Expose
        private Long magicDamageDealt;
        @SerializedName("firstBloodAssist")
        @Expose
        private Boolean firstBloodAssist;
        @SerializedName("item2")
        @Expose
        private Long item2;
        @SerializedName("item3")
        @Expose
        private Long item3;
        @SerializedName("item0")
        @Expose
        private Long item0;
        @SerializedName("item1")
        @Expose
        private Long item1;
        @SerializedName("item6")
        @Expose
        private Long item6;
        @SerializedName("item4")
        @Expose
        private Long item4;
        @SerializedName("item5")
        @Expose
        private Long item5;
        @SerializedName("perk1")
        @Expose
        private Long perk1;
        @SerializedName("perk0")
        @Expose
        private Long perk0;
        @SerializedName("perk3")
        @Expose
        private Long perk3;
        @SerializedName("perk2")
        @Expose
        private Long perk2;
        @SerializedName("perk3Var3")
        @Expose
        private Long perk3Var3;
        @SerializedName("perk3Var2")
        @Expose
        private Long perk3Var2;
        @SerializedName("perk3Var1")
        @Expose
        private Long perk3Var1;
        @SerializedName("damageSelfMitigated")
        @Expose
        private Long damageSelfMitigated;
        @SerializedName("magicalDamageTaken")
        @Expose
        private Long magicalDamageTaken;
        @SerializedName("perk0Var2")
        @Expose
        private Long perk0Var2;
        @SerializedName("firstInhibitorKill")
        @Expose
        private Boolean firstInhibitorKill;
        @SerializedName("trueDamageTaken")
        @Expose
        private Long trueDamageTaken;
        @SerializedName("assists")
        @Expose
        private Long assists;
        @SerializedName("perk4Var2")
        @Expose
        private Long perk4Var2;
        @SerializedName("goldSpent")
        @Expose
        private Long goldSpent;
        @SerializedName("trueDamageDealt")
        @Expose
        private Long trueDamageDealt;
        @SerializedName("participantId")
        @Expose
        private Long participantId;
        @SerializedName("physicalDamageDealt")
        @Expose
        private Long physicalDamageDealt;
        @SerializedName("sightWardsBoughtInGame")
        @Expose
        private Long sightWardsBoughtInGame;
        @SerializedName("totalDamageDealtToChampions")
        @Expose
        private Long totalDamageDealtToChampions;
        @SerializedName("physicalDamageTaken")
        @Expose
        private Long physicalDamageTaken;
        @SerializedName("totalPlayerScore")
        @Expose
        private Long totalPlayerScore;
        @SerializedName("win")
        @Expose
        private Boolean win;
        @SerializedName("objectivePlayerScore")
        @Expose
        private Long objectivePlayerScore;
        @SerializedName("totalDamageDealt")
        @Expose
        private Long totalDamageDealt;
        @SerializedName("neutralMinionsKilledEnemyJungle")
        @Expose
        private Long neutralMinionsKilledEnemyJungle;
        @SerializedName("deaths")
        @Expose
        private Long deaths;
        @SerializedName("wardsPlaced")
        @Expose
        private Long wardsPlaced;
        @SerializedName("perkPrimaryStyle")
        @Expose
        private Long perkPrimaryStyle;
        @SerializedName("perkSubStyle")
        @Expose
        private Long perkSubStyle;
        @SerializedName("turretKills")
        @Expose
        private Long turretKills;
        @SerializedName("firstBloodKill")
        @Expose
        private Boolean firstBloodKill;
        @SerializedName("trueDamageDealtToChampions")
        @Expose
        private Long trueDamageDealtToChampions;
        @SerializedName("goldEarned")
        @Expose
        private Long goldEarned;
        @SerializedName("killingSprees")
        @Expose
        private Long killingSprees;
        @SerializedName("unrealKills")
        @Expose
        private Long unrealKills;
        @SerializedName("firstTowerAssist")
        @Expose
        private Boolean firstTowerAssist;
        @SerializedName("firstTowerKill")
        @Expose
        private Boolean firstTowerKill;
        @SerializedName("champLevel")
        @Expose
        private Long champLevel;
        @SerializedName("doubleKills")
        @Expose
        private Long doubleKills;
        @SerializedName("inhibitorKills")
        @Expose
        private Long inhibitorKills;
        @SerializedName("firstInhibitorAssist")
        @Expose
        private Boolean firstInhibitorAssist;
        @SerializedName("perk0Var1")
        @Expose
        private Long perk0Var1;
        @SerializedName("combatPlayerScore")
        @Expose
        private Long combatPlayerScore;
        @SerializedName("perk0Var3")
        @Expose
        private Long perk0Var3;
        @SerializedName("visionWardsBoughtInGame")
        @Expose
        private Long visionWardsBoughtInGame;
        @SerializedName("pentaKills")
        @Expose
        private Long pentaKills;
        @SerializedName("totalHeal")
        @Expose
        private Long totalHeal;
        @SerializedName("totalMinionsKilled")
        @Expose
        private Long totalMinionsKilled;
        @SerializedName("timeCCingOthers")
        @Expose
        private Long timeCCingOthers;
        @SerializedName("statPerk2")
        @Expose
        private Long statPerk2;

        public Long getNeutralMinionsKilledTeamJungle() {
            return neutralMinionsKilledTeamJungle;
        }

        public void setNeutralMinionsKilledTeamJungle(Long neutralMinionsKilledTeamJungle) {
            this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
        }

        public Long getVisionScore() {
            return visionScore;
        }

        public void setVisionScore(Long visionScore) {
            this.visionScore = visionScore;
        }

        public Long getMagicDamageDealtToChampions() {
            return magicDamageDealtToChampions;
        }

        public void setMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
            this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        }

        public Long getLargestMultiKill() {
            return largestMultiKill;
        }

        public void setLargestMultiKill(Long largestMultiKill) {
            this.largestMultiKill = largestMultiKill;
        }

        public Long getTotalTimeCrowdControlDealt() {
            return totalTimeCrowdControlDealt;
        }

        public void setTotalTimeCrowdControlDealt(Long totalTimeCrowdControlDealt) {
            this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
        }

        public Long getLongestTimeSpentLiving() {
            return longestTimeSpentLiving;
        }

        public void setLongestTimeSpentLiving(Long longestTimeSpentLiving) {
            this.longestTimeSpentLiving = longestTimeSpentLiving;
        }

        public Long getPerk1Var1() {
            return perk1Var1;
        }

        public void setPerk1Var1(Long perk1Var1) {
            this.perk1Var1 = perk1Var1;
        }

        public Long getPerk1Var3() {
            return perk1Var3;
        }

        public void setPerk1Var3(Long perk1Var3) {
            this.perk1Var3 = perk1Var3;
        }

        public Long getPerk1Var2() {
            return perk1Var2;
        }

        public void setPerk1Var2(Long perk1Var2) {
            this.perk1Var2 = perk1Var2;
        }

        public Long getTripleKills() {
            return tripleKills;
        }

        public void setTripleKills(Long tripleKills) {
            this.tripleKills = tripleKills;
        }

        public Long getPerk5() {
            return perk5;
        }

        public void setPerk5(Long perk5) {
            this.perk5 = perk5;
        }

        public Long getPerk4() {
            return perk4;
        }

        public void setPerk4(Long perk4) {
            this.perk4 = perk4;
        }

        public Long getPlayerScore9() {
            return playerScore9;
        }

        public void setPlayerScore9(Long playerScore9) {
            this.playerScore9 = playerScore9;
        }

        public Long getPlayerScore8() {
            return playerScore8;
        }

        public void setPlayerScore8(Long playerScore8) {
            this.playerScore8 = playerScore8;
        }

        public Long getKills() {
            return kills;
        }

        public void setKills(Long kills) {
            this.kills = kills;
        }

        public Long getPlayerScore1() {
            return playerScore1;
        }

        public void setPlayerScore1(Long playerScore1) {
            this.playerScore1 = playerScore1;
        }

        public Long getPlayerScore0() {
            return playerScore0;
        }

        public void setPlayerScore0(Long playerScore0) {
            this.playerScore0 = playerScore0;
        }

        public Long getPlayerScore3() {
            return playerScore3;
        }

        public void setPlayerScore3(Long playerScore3) {
            this.playerScore3 = playerScore3;
        }

        public Long getPlayerScore2() {
            return playerScore2;
        }

        public void setPlayerScore2(Long playerScore2) {
            this.playerScore2 = playerScore2;
        }

        public Long getPlayerScore5() {
            return playerScore5;
        }

        public void setPlayerScore5(Long playerScore5) {
            this.playerScore5 = playerScore5;
        }

        public Long getPlayerScore4() {
            return playerScore4;
        }

        public void setPlayerScore4(Long playerScore4) {
            this.playerScore4 = playerScore4;
        }

        public Long getPlayerScore7() {
            return playerScore7;
        }

        public void setPlayerScore7(Long playerScore7) {
            this.playerScore7 = playerScore7;
        }

        public Long getPlayerScore6() {
            return playerScore6;
        }

        public void setPlayerScore6(Long playerScore6) {
            this.playerScore6 = playerScore6;
        }

        public Long getPerk5Var1() {
            return perk5Var1;
        }

        public void setPerk5Var1(Long perk5Var1) {
            this.perk5Var1 = perk5Var1;
        }

        public Long getPerk5Var3() {
            return perk5Var3;
        }

        public void setPerk5Var3(Long perk5Var3) {
            this.perk5Var3 = perk5Var3;
        }

        public Long getPerk5Var2() {
            return perk5Var2;
        }

        public void setPerk5Var2(Long perk5Var2) {
            this.perk5Var2 = perk5Var2;
        }

        public Long getTotalScoreRank() {
            return totalScoreRank;
        }

        public void setTotalScoreRank(Long totalScoreRank) {
            this.totalScoreRank = totalScoreRank;
        }

        public Long getNeutralMinionsKilled() {
            return neutralMinionsKilled;
        }

        public void setNeutralMinionsKilled(Long neutralMinionsKilled) {
            this.neutralMinionsKilled = neutralMinionsKilled;
        }

        public Long getStatPerk1() {
            return statPerk1;
        }

        public void setStatPerk1(Long statPerk1) {
            this.statPerk1 = statPerk1;
        }

        public Long getStatPerk0() {
            return statPerk0;
        }

        public void setStatPerk0(Long statPerk0) {
            this.statPerk0 = statPerk0;
        }

        public Long getDamageDealtToTurrets() {
            return damageDealtToTurrets;
        }

        public void setDamageDealtToTurrets(Long damageDealtToTurrets) {
            this.damageDealtToTurrets = damageDealtToTurrets;
        }

        public Long getPhysicalDamageDealtToChampions() {
            return physicalDamageDealtToChampions;
        }

        public void setPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
            this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        }

        public Long getDamageDealtToObjectives() {
            return damageDealtToObjectives;
        }

        public void setDamageDealtToObjectives(Long damageDealtToObjectives) {
            this.damageDealtToObjectives = damageDealtToObjectives;
        }

        public Long getPerk2Var2() {
            return perk2Var2;
        }

        public void setPerk2Var2(Long perk2Var2) {
            this.perk2Var2 = perk2Var2;
        }

        public Long getPerk2Var3() {
            return perk2Var3;
        }

        public void setPerk2Var3(Long perk2Var3) {
            this.perk2Var3 = perk2Var3;
        }

        public Long getTotalUnitsHealed() {
            return totalUnitsHealed;
        }

        public void setTotalUnitsHealed(Long totalUnitsHealed) {
            this.totalUnitsHealed = totalUnitsHealed;
        }

        public Long getPerk2Var1() {
            return perk2Var1;
        }

        public void setPerk2Var1(Long perk2Var1) {
            this.perk2Var1 = perk2Var1;
        }

        public Long getPerk4Var1() {
            return perk4Var1;
        }

        public void setPerk4Var1(Long perk4Var1) {
            this.perk4Var1 = perk4Var1;
        }

        public Long getTotalDamageTaken() {
            return totalDamageTaken;
        }

        public void setTotalDamageTaken(Long totalDamageTaken) {
            this.totalDamageTaken = totalDamageTaken;
        }

        public Long getPerk4Var3() {
            return perk4Var3;
        }

        public void setPerk4Var3(Long perk4Var3) {
            this.perk4Var3 = perk4Var3;
        }

        public Long getWardsKilled() {
            return wardsKilled;
        }

        public void setWardsKilled(Long wardsKilled) {
            this.wardsKilled = wardsKilled;
        }

        public Long getLargestCriticalStrike() {
            return largestCriticalStrike;
        }

        public void setLargestCriticalStrike(Long largestCriticalStrike) {
            this.largestCriticalStrike = largestCriticalStrike;
        }

        public Long getLargestKillingSpree() {
            return largestKillingSpree;
        }

        public void setLargestKillingSpree(Long largestKillingSpree) {
            this.largestKillingSpree = largestKillingSpree;
        }

        public Long getQuadraKills() {
            return quadraKills;
        }

        public void setQuadraKills(Long quadraKills) {
            this.quadraKills = quadraKills;
        }

        public Long getMagicDamageDealt() {
            return magicDamageDealt;
        }

        public void setMagicDamageDealt(Long magicDamageDealt) {
            this.magicDamageDealt = magicDamageDealt;
        }

        public Boolean getFirstBloodAssist() {
            return firstBloodAssist;
        }

        public void setFirstBloodAssist(Boolean firstBloodAssist) {
            this.firstBloodAssist = firstBloodAssist;
        }

        public Long getItem2() {
            return item2;
        }

        public void setItem2(Long item2) {
            this.item2 = item2;
        }

        public Long getItem3() {
            return item3;
        }

        public void setItem3(Long item3) {
            this.item3 = item3;
        }

        public Long getItem0() {
            return item0;
        }

        public void setItem0(Long item0) {
            this.item0 = item0;
        }

        public Long getItem1() {
            return item1;
        }

        public void setItem1(Long item1) {
            this.item1 = item1;
        }

        public Long getItem6() {
            return item6;
        }

        public void setItem6(Long item6) {
            this.item6 = item6;
        }

        public Long getItem4() {
            return item4;
        }

        public void setItem4(Long item4) {
            this.item4 = item4;
        }

        public Long getItem5() {
            return item5;
        }

        public void setItem5(Long item5) {
            this.item5 = item5;
        }

        public Long getPerk1() {
            return perk1;
        }

        public void setPerk1(Long perk1) {
            this.perk1 = perk1;
        }

        public Long getPerk0() {
            return perk0;
        }

        public void setPerk0(Long perk0) {
            this.perk0 = perk0;
        }

        public Long getPerk3() {
            return perk3;
        }

        public void setPerk3(Long perk3) {
            this.perk3 = perk3;
        }

        public Long getPerk2() {
            return perk2;
        }

        public void setPerk2(Long perk2) {
            this.perk2 = perk2;
        }

        public Long getPerk3Var3() {
            return perk3Var3;
        }

        public void setPerk3Var3(Long perk3Var3) {
            this.perk3Var3 = perk3Var3;
        }

        public Long getPerk3Var2() {
            return perk3Var2;
        }

        public void setPerk3Var2(Long perk3Var2) {
            this.perk3Var2 = perk3Var2;
        }

        public Long getPerk3Var1() {
            return perk3Var1;
        }

        public void setPerk3Var1(Long perk3Var1) {
            this.perk3Var1 = perk3Var1;
        }

        public Long getDamageSelfMitigated() {
            return damageSelfMitigated;
        }

        public void setDamageSelfMitigated(Long damageSelfMitigated) {
            this.damageSelfMitigated = damageSelfMitigated;
        }

        public Long getMagicalDamageTaken() {
            return magicalDamageTaken;
        }

        public void setMagicalDamageTaken(Long magicalDamageTaken) {
            this.magicalDamageTaken = magicalDamageTaken;
        }

        public Long getPerk0Var2() {
            return perk0Var2;
        }

        public void setPerk0Var2(Long perk0Var2) {
            this.perk0Var2 = perk0Var2;
        }

        public Boolean getFirstInhibitorKill() {
            return firstInhibitorKill;
        }

        public void setFirstInhibitorKill(Boolean firstInhibitorKill) {
            this.firstInhibitorKill = firstInhibitorKill;
        }

        public Long getTrueDamageTaken() {
            return trueDamageTaken;
        }

        public void setTrueDamageTaken(Long trueDamageTaken) {
            this.trueDamageTaken = trueDamageTaken;
        }

        public Long getAssists() {
            return assists;
        }

        public void setAssists(Long assists) {
            this.assists = assists;
        }

        public Long getPerk4Var2() {
            return perk4Var2;
        }

        public void setPerk4Var2(Long perk4Var2) {
            this.perk4Var2 = perk4Var2;
        }

        public Long getGoldSpent() {
            return goldSpent;
        }

        public void setGoldSpent(Long goldSpent) {
            this.goldSpent = goldSpent;
        }

        public Long getTrueDamageDealt() {
            return trueDamageDealt;
        }

        public void setTrueDamageDealt(Long trueDamageDealt) {
            this.trueDamageDealt = trueDamageDealt;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public void setParticipantId(Long participantId) {
            this.participantId = participantId;
        }

        public Long getPhysicalDamageDealt() {
            return physicalDamageDealt;
        }

        public void setPhysicalDamageDealt(Long physicalDamageDealt) {
            this.physicalDamageDealt = physicalDamageDealt;
        }

        public Long getSightWardsBoughtInGame() {
            return sightWardsBoughtInGame;
        }

        public void setSightWardsBoughtInGame(Long sightWardsBoughtInGame) {
            this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        }

        public Long getTotalDamageDealtToChampions() {
            return totalDamageDealtToChampions;
        }

        public void setTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
            this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        }

        public Long getPhysicalDamageTaken() {
            return physicalDamageTaken;
        }

        public void setPhysicalDamageTaken(Long physicalDamageTaken) {
            this.physicalDamageTaken = physicalDamageTaken;
        }

        public Long getTotalPlayerScore() {
            return totalPlayerScore;
        }

        public void setTotalPlayerScore(Long totalPlayerScore) {
            this.totalPlayerScore = totalPlayerScore;
        }

        public Boolean getWin() {
            return win;
        }

        public void setWin(Boolean win) {
            this.win = win;
        }

        public Long getObjectivePlayerScore() {
            return objectivePlayerScore;
        }

        public void setObjectivePlayerScore(Long objectivePlayerScore) {
            this.objectivePlayerScore = objectivePlayerScore;
        }

        public Long getTotalDamageDealt() {
            return totalDamageDealt;
        }

        public void setTotalDamageDealt(Long totalDamageDealt) {
            this.totalDamageDealt = totalDamageDealt;
        }

        public Long getNeutralMinionsKilledEnemyJungle() {
            return neutralMinionsKilledEnemyJungle;
        }

        public void setNeutralMinionsKilledEnemyJungle(Long neutralMinionsKilledEnemyJungle) {
            this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
        }

        public Long getDeaths() {
            return deaths;
        }

        public void setDeaths(Long deaths) {
            this.deaths = deaths;
        }

        public Long getWardsPlaced() {
            return wardsPlaced;
        }

        public void setWardsPlaced(Long wardsPlaced) {
            this.wardsPlaced = wardsPlaced;
        }

        public Long getPerkPrimaryStyle() {
            return perkPrimaryStyle;
        }

        public void setPerkPrimaryStyle(Long perkPrimaryStyle) {
            this.perkPrimaryStyle = perkPrimaryStyle;
        }

        public Long getPerkSubStyle() {
            return perkSubStyle;
        }

        public void setPerkSubStyle(Long perkSubStyle) {
            this.perkSubStyle = perkSubStyle;
        }

        public Long getTurretKills() {
            return turretKills;
        }

        public void setTurretKills(Long turretKills) {
            this.turretKills = turretKills;
        }

        public Boolean getFirstBloodKill() {
            return firstBloodKill;
        }

        public void setFirstBloodKill(Boolean firstBloodKill) {
            this.firstBloodKill = firstBloodKill;
        }

        public Long getTrueDamageDealtToChampions() {
            return trueDamageDealtToChampions;
        }

        public void setTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
            this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        }

        public Long getGoldEarned() {
            return goldEarned;
        }

        public void setGoldEarned(Long goldEarned) {
            this.goldEarned = goldEarned;
        }

        public Long getKillingSprees() {
            return killingSprees;
        }

        public void setKillingSprees(Long killingSprees) {
            this.killingSprees = killingSprees;
        }

        public Long getUnrealKills() {
            return unrealKills;
        }

        public void setUnrealKills(Long unrealKills) {
            this.unrealKills = unrealKills;
        }

        public Boolean getFirstTowerAssist() {
            return firstTowerAssist;
        }

        public void setFirstTowerAssist(Boolean firstTowerAssist) {
            this.firstTowerAssist = firstTowerAssist;
        }

        public Boolean getFirstTowerKill() {
            return firstTowerKill;
        }

        public void setFirstTowerKill(Boolean firstTowerKill) {
            this.firstTowerKill = firstTowerKill;
        }

        public Long getChampLevel() {
            return champLevel;
        }

        public void setChampLevel(Long champLevel) {
            this.champLevel = champLevel;
        }

        public Long getDoubleKills() {
            return doubleKills;
        }

        public void setDoubleKills(Long doubleKills) {
            this.doubleKills = doubleKills;
        }

        public Long getInhibitorKills() {
            return inhibitorKills;
        }

        public void setInhibitorKills(Long inhibitorKills) {
            this.inhibitorKills = inhibitorKills;
        }

        public Boolean getFirstInhibitorAssist() {
            return firstInhibitorAssist;
        }

        public void setFirstInhibitorAssist(Boolean firstInhibitorAssist) {
            this.firstInhibitorAssist = firstInhibitorAssist;
        }

        public Long getPerk0Var1() {
            return perk0Var1;
        }

        public void setPerk0Var1(Long perk0Var1) {
            this.perk0Var1 = perk0Var1;
        }

        public Long getCombatPlayerScore() {
            return combatPlayerScore;
        }

        public void setCombatPlayerScore(Long combatPlayerScore) {
            this.combatPlayerScore = combatPlayerScore;
        }

        public Long getPerk0Var3() {
            return perk0Var3;
        }

        public void setPerk0Var3(Long perk0Var3) {
            this.perk0Var3 = perk0Var3;
        }

        public Long getVisionWardsBoughtInGame() {
            return visionWardsBoughtInGame;
        }

        public void setVisionWardsBoughtInGame(Long visionWardsBoughtInGame) {
            this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        }

        public Long getPentaKills() {
            return pentaKills;
        }

        public void setPentaKills(Long pentaKills) {
            this.pentaKills = pentaKills;
        }

        public Long getTotalHeal() {
            return totalHeal;
        }

        public void setTotalHeal(Long totalHeal) {
            this.totalHeal = totalHeal;
        }

        public Long getTotalMinionsKilled() {
            return totalMinionsKilled;
        }

        public void setTotalMinionsKilled(Long totalMinionsKilled) {
            this.totalMinionsKilled = totalMinionsKilled;
        }

        public Long getTimeCCingOthers() {
            return timeCCingOthers;
        }

        public void setTimeCCingOthers(Long timeCCingOthers) {
            this.timeCCingOthers = timeCCingOthers;
        }

        public Long getStatPerk2() {
            return statPerk2;
        }

        public void setStatPerk2(Long statPerk2) {
            this.statPerk2 = statPerk2;
        }

        @BindingAdapter("loadChampionImage")
        public static void loadChampionImage(ImageView view, Long championId) {
            try {
                Glide.with(view.getContext())
                        .load("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + RiotJsonUtils.getChampionName(view.getContext(), championId) + ".png")
                        .apply(new RequestOptions().circleCrop())
                        .into(view);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @BindingAdapter("loadSpellImage")
        public static void loadSpellImage(ImageView view, Long spellId) {
            Glide.with(view.getContext())
                    .load("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/item/" + spellId + ".png")
                    .into(view);
        }

        @BindingAdapter("loadItemImage")
        public static void loadItemImage(ImageView view, Long itemId) {
            try {
                Glide.with(view.getContext())
                        .load("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/spell/" + RiotJsonUtils.getSummonerSpell(view.getContext(), itemId) + ".png")
                        .into(view);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public static class Team {

        @SerializedName("firstDragon")
        @Expose
        private Boolean firstDragon;
        @SerializedName("bans")
        @Expose
        private List<Ban> bans = null;
        @SerializedName("firstInhibitor")
        @Expose
        private Boolean firstInhibitor;
        @SerializedName("win")
        @Expose
        private String win;
        @SerializedName("firstRiftHerald")
        @Expose
        private Boolean firstRiftHerald;
        @SerializedName("firstBaron")
        @Expose
        private Boolean firstBaron;
        @SerializedName("baronKills")
        @Expose
        private Long baronKills;
        @SerializedName("riftHeraldKills")
        @Expose
        private Long riftHeraldKills;
        @SerializedName("firstBlood")
        @Expose
        private Boolean firstBlood;
        @SerializedName("teamId")
        @Expose
        private Long teamId;
        @SerializedName("firstTower")
        @Expose
        private Boolean firstTower;
        @SerializedName("vilemawKills")
        @Expose
        private Long vilemawKills;
        @SerializedName("inhibitorKills")
        @Expose
        private Long inhibitorKills;
        @SerializedName("towerKills")
        @Expose
        private Long towerKills;
        @SerializedName("dominionVictoryScore")
        @Expose
        private Long dominionVictoryScore;
        @SerializedName("dragonKills")
        @Expose
        private Long dragonKills;

        public Boolean getFirstDragon() {
            return firstDragon;
        }

        public void setFirstDragon(Boolean firstDragon) {
            this.firstDragon = firstDragon;
        }

        public List<Ban> getBans() {
            return bans;
        }

        public void setBans(List<Ban> bans) {
            this.bans = bans;
        }

        public Boolean getFirstInhibitor() {
            return firstInhibitor;
        }

        public void setFirstInhibitor(Boolean firstInhibitor) {
            this.firstInhibitor = firstInhibitor;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        public Boolean getFirstRiftHerald() {
            return firstRiftHerald;
        }

        public void setFirstRiftHerald(Boolean firstRiftHerald) {
            this.firstRiftHerald = firstRiftHerald;
        }

        public Boolean getFirstBaron() {
            return firstBaron;
        }

        public void setFirstBaron(Boolean firstBaron) {
            this.firstBaron = firstBaron;
        }

        public Long getBaronKills() {
            return baronKills;
        }

        public void setBaronKills(Long baronKills) {
            this.baronKills = baronKills;
        }

        public Long getRiftHeraldKills() {
            return riftHeraldKills;
        }

        public void setRiftHeraldKills(Long riftHeraldKills) {
            this.riftHeraldKills = riftHeraldKills;
        }

        public Boolean getFirstBlood() {
            return firstBlood;
        }

        public void setFirstBlood(Boolean firstBlood) {
            this.firstBlood = firstBlood;
        }

        public Long getTeamId() {
            return teamId;
        }

        public void setTeamId(Long teamId) {
            this.teamId = teamId;
        }

        public Boolean getFirstTower() {
            return firstTower;
        }

        public void setFirstTower(Boolean firstTower) {
            this.firstTower = firstTower;
        }

        public Long getVilemawKills() {
            return vilemawKills;
        }

        public void setVilemawKills(Long vilemawKills) {
            this.vilemawKills = vilemawKills;
        }

        public Long getInhibitorKills() {
            return inhibitorKills;
        }

        public void setInhibitorKills(Long inhibitorKills) {
            this.inhibitorKills = inhibitorKills;
        }

        public Long getTowerKills() {
            return towerKills;
        }

        public void setTowerKills(Long towerKills) {
            this.towerKills = towerKills;
        }

        public Long getDominionVictoryScore() {
            return dominionVictoryScore;
        }

        public void setDominionVictoryScore(Long dominionVictoryScore) {
            this.dominionVictoryScore = dominionVictoryScore;
        }

        public Long getDragonKills() {
            return dragonKills;
        }

        public void setDragonKills(Long dragonKills) {
            this.dragonKills = dragonKills;
        }

    }


    public static class Timeline {

        @SerializedName("lane")
        @Expose
        private String lane;
        @SerializedName("participantId")
        @Expose
        private Long participantId;
        @SerializedName("csDiffPerMinDeltas")
        @Expose
        private CsDiffPerMinDeltas csDiffPerMinDeltas;
        @SerializedName("goldPerMinDeltas")
        @Expose
        private GoldPerMinDeltas goldPerMinDeltas;
        @SerializedName("xpDiffPerMinDeltas")
        @Expose
        private XpDiffPerMinDeltas xpDiffPerMinDeltas;
        @SerializedName("creepsPerMinDeltas")
        @Expose
        private CreepsPerMinDeltas creepsPerMinDeltas;
        @SerializedName("xpPerMinDeltas")
        @Expose
        private XpPerMinDeltas xpPerMinDeltas;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("damageTakenDiffPerMinDeltas")
        @Expose
        private DamageTakenDiffPerMinDeltas damageTakenDiffPerMinDeltas;
        @SerializedName("damageTakenPerMinDeltas")
        @Expose
        private DamageTakenPerMinDeltas damageTakenPerMinDeltas;

        public String getLane() {
            return lane;
        }

        public void setLane(String lane) {
            this.lane = lane;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public void setParticipantId(Long participantId) {
            this.participantId = participantId;
        }

        public CsDiffPerMinDeltas getCsDiffPerMinDeltas() {
            return csDiffPerMinDeltas;
        }

        public void setCsDiffPerMinDeltas(CsDiffPerMinDeltas csDiffPerMinDeltas) {
            this.csDiffPerMinDeltas = csDiffPerMinDeltas;
        }

        public GoldPerMinDeltas getGoldPerMinDeltas() {
            return goldPerMinDeltas;
        }

        public void setGoldPerMinDeltas(GoldPerMinDeltas goldPerMinDeltas) {
            this.goldPerMinDeltas = goldPerMinDeltas;
        }

        public XpDiffPerMinDeltas getXpDiffPerMinDeltas() {
            return xpDiffPerMinDeltas;
        }

        public void setXpDiffPerMinDeltas(XpDiffPerMinDeltas xpDiffPerMinDeltas) {
            this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
        }

        public CreepsPerMinDeltas getCreepsPerMinDeltas() {
            return creepsPerMinDeltas;
        }

        public void setCreepsPerMinDeltas(CreepsPerMinDeltas creepsPerMinDeltas) {
            this.creepsPerMinDeltas = creepsPerMinDeltas;
        }

        public XpPerMinDeltas getXpPerMinDeltas() {
            return xpPerMinDeltas;
        }

        public void setXpPerMinDeltas(XpPerMinDeltas xpPerMinDeltas) {
            this.xpPerMinDeltas = xpPerMinDeltas;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public DamageTakenDiffPerMinDeltas getDamageTakenDiffPerMinDeltas() {
            return damageTakenDiffPerMinDeltas;
        }

        public void setDamageTakenDiffPerMinDeltas(DamageTakenDiffPerMinDeltas damageTakenDiffPerMinDeltas) {
            this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
        }

        public DamageTakenPerMinDeltas getDamageTakenPerMinDeltas() {
            return damageTakenPerMinDeltas;
        }

        public void setDamageTakenPerMinDeltas(DamageTakenPerMinDeltas damageTakenPerMinDeltas) {
            this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
        }

    }


    public static class XpDiffPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get2030() {
            return _2030;
        }

        public void set2030(Double _2030) {
            this._2030 = _2030;
        }

        public Double get010() {
            return _010;
        }

        public void set010(Double _010) {
            this._010 = _010;
        }

        public Double get1020() {
            return _1020;
        }

        public void set1020(Double _1020) {
            this._1020 = _1020;
        }

    }


    public static class XpPerMinDeltas {

        @SerializedName("20-30")
        @Expose
        private Double _2030;
        @SerializedName("0-10")
        @Expose
        private Double _010;
        @SerializedName("10-20")
        @Expose
        private Double _1020;

        public Double get2030() {
            return _2030;
        }

        public void set2030(Double _2030) {
            this._2030 = _2030;
        }

        public Double get010() {
            return _010;
        }

        public void set010(Double _010) {
            this._010 = _010;
        }

        public Double get1020() {
            return _1020;
        }

        public void set1020(Double _1020) {
            this._1020 = _1020;
        }

    }
}