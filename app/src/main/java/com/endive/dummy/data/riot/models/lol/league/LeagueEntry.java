package com.endive.dummy.data.riot.models.lol.league;

import com.endive.dummy.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueEntry {

    @SerializedName("queueType")
    @Expose
    private String queueType;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("hotStreak")
    @Expose
    private boolean hotStreak;
    @SerializedName("miniSeries")
    @Expose
    private MiniSeries miniSeries;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("veteran")
    @Expose
    private boolean veteran;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("inactive")
    @Expose
    private boolean inactive;
    @SerializedName("freshBlood")
    @Expose
    private boolean freshBlood;
    @SerializedName("leagueId")
    @Expose
    private String leagueId;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("leaguePoints")
    @Expose
    private long leaguePoints;

    public String getQueueType() {
        return queueType;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public boolean getHotStreak() {
        return hotStreak;
    }

    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    public long getWins() {
        return wins;
    }

    public boolean getVeteran() {
        return veteran;
    }

    public long getLosses() {
        return losses;
    }

    public String getRank() {
        return rank;
    }

    public String getTier() {
        return tier;
    }

    public boolean getInactive() {
        return inactive;
    }

    public boolean getFreshBlood() {
        return freshBlood;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public long getLeaguePoints() {
        return leaguePoints;
    }

    public String getReadableQueueType(){
        switch (getQueueType()){
            case "RANKED_SOLO_5x5":
                return "Solo";

            case "RANKED_FLEX_SR":
                return "Flex 5c5";

            case "RANKED_FLEX_TT":
                return "Flex 3c3";

            default:
                return "";
        }
    }

    public static int getDrawableTier(String tier){
        switch (tier){
            case "IRON":
                return R.drawable.emblem_iron;

            case "BRONZE":
                return R.drawable.emblem_bronze;

            case "SILVER":
                return R.drawable.emblem_silver;

            case "GOLD":
                return R.drawable.emblem_gold;

            case "PLATINUM":
                return R.drawable.emblem_platinum;

            case "DIAMOND":
                return R.drawable.emblem_diamond;

            case "MASTER":
                return R.drawable.emblem_master;

            case "GRANDMASTER":
                return R.drawable.emblem_grandmaster;

            case "CHALLENGER":
                return R.drawable.emblem_challenger;
        }
        return 0;
    }

}
