package com.endive.dummy.data.riot.models.lol.championmastery;

import com.endive.dummy.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChampionMastery {

    @SerializedName("championLevel")
    @Expose
    private long championLevel;
    @SerializedName("chestGranted")
    @Expose
    private boolean chestGranted;
    @SerializedName("championPoints")
    @Expose
    private long championPoints;
    @SerializedName("championPointsSinceLastLevel")
    @Expose
    private long championPointsSinceLastLevel;
    @SerializedName("championPointsUntilNextLevel")
    @Expose
    private long championPointsUntilNextLevel;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("tokensEarned")
    @Expose
    private long tokensEarned;
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("lastPlayTime")
    @Expose
    private long lastPlayTime;

    public long getChampionLevel() {
        return championLevel;
    }

    public boolean getChestGranted() {
        return chestGranted;
    }

    public long getChampionPoints() {
        return championPoints;
    }

    public long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public long getTokensEarned() {
        return tokensEarned;
    }

    public long getChampionId() {
        return championId;
    }

    public long getLastPlayTime() {
        return lastPlayTime;
    }

    public double getPercentageToNextLevel(){
        if(championPointsUntilNextLevel == 0){
            return 1.0;
        }
        return (double) (championPointsSinceLastLevel / (championPointsSinceLastLevel + championPointsUntilNextLevel));
    }

    public static int getMasteryDrawable(long championLevel){
        if (championLevel == 0) {
            return R.drawable.champion_mastery_0;
        } else if (championLevel == 1) {
            return R.drawable.champion_mastery_1;
        } else if (championLevel == 2) {
            return R.drawable.champion_mastery_2;
        } else if (championLevel == 3) {
            return R.drawable.champion_mastery_3;
        } else if (championLevel == 4) {
            return R.drawable.champion_mastery_4;
        } else if (championLevel == 5) {
            return R.drawable.champion_mastery_5;
        } else if (championLevel == 6) {
            return R.drawable.champion_mastery_6;
        } else {
            return R.drawable.champion_mastery_7;
        }
    }
}