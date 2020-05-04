package com.endive.dummy.model.league;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
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
    private Boolean hotStreak;
    @SerializedName("miniSeries")
    @Expose
    private MiniSeries miniSeries;
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
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("inactive")
    @Expose
    private Boolean inactive;
    @SerializedName("freshBlood")
    @Expose
    private Boolean freshBlood;
    @SerializedName("leagueId")
    @Expose
    private String leagueId;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("leaguePoints")
    @Expose
    private Long leaguePoints;

    public String getQueueType() {
        return queueType;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public Boolean getHotStreak() {
        return hotStreak;
    }

    public MiniSeries getMiniSeries() {
        return miniSeries;
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

    public String getTier() {
        return tier;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public Boolean getFreshBlood() {
        return freshBlood;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public Long getLeaguePoints() {
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

    @BindingAdapter("loadTierIcon")
    public static void loadTierIcon(ImageView imageView, String tier){
        Glide.with(imageView.getContext())
                .load(imageView.getContext().getResources().getDrawable(getDrawableTier(tier)))
                .into(imageView);
    }

    public static class MiniSeries {

        @SerializedName("wins")
        @Expose
        private Long wins;
        @SerializedName("losses")
        @Expose
        private Long losses;
        @SerializedName("target")
        @Expose
        private Long target;
        @SerializedName("progress")
        @Expose
        private String progress;

        public Long getWins() {
            return wins;
        }

        public Long getLosses() {
            return losses;
        }

        public Long getTarget() {
            return target;
        }

        public String getProgress() {
            return progress;
        }
    }

}
