package com.endive.dummy.model.championmastery;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.endive.dummy.R;
import com.endive.dummy.util.RiotJsonUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

public class ChampionMastery {

    @SerializedName("championLevel")
    @Expose
    private Long championLevel;
    @SerializedName("chestGranted")
    @Expose
    private Boolean chestGranted;
    @SerializedName("championPoints")
    @Expose
    private Long championPoints;
    @SerializedName("championPointsSinceLastLevel")
    @Expose
    private Long championPointsSinceLastLevel;
    @SerializedName("championPointsUntilNextLevel")
    @Expose
    private Long championPointsUntilNextLevel;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("tokensEarned")
    @Expose
    private Long tokensEarned;
    @SerializedName("championId")
    @Expose
    private Long championId;
    @SerializedName("lastPlayTime")
    @Expose
    private Long lastPlayTime;

    public Long getChampionLevel() {
        return championLevel;
    }

    public Boolean getChestGranted() {
        return chestGranted;
    }

    public Long getChampionPoints() {
        return championPoints;
    }

    public Long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public Long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public Long getTokensEarned() {
        return tokensEarned;
    }

    public Long getChampionId() {
        return championId;
    }

    public Long getLastPlayTime() {
        return lastPlayTime;
    }

    public Double getPercentageToNextLevel(){
        if(championPointsUntilNextLevel == 0){
            return 1.0;
        }
        return (double) (championPointsSinceLastLevel / (championPointsSinceLastLevel + championPointsUntilNextLevel));
    }

    @BindingAdapter("championImage")
    public static void loadImage(ImageView view, Long championId) {
        try {
            Glide.with(view.getContext())
                .load("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + RiotJsonUtils.getChampionName(view.getContext(), championId) + ".png")
                .into(view);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @BindingAdapter("masteryFrame")
    public static void masteryFrame(ImageView imageView, Long championLevel){
        Glide.with(imageView.getContext())
                .load(getMasteryDrawable(championLevel))
                .into(imageView);
    }

    public static int getMasteryDrawable(Long championLevel){
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