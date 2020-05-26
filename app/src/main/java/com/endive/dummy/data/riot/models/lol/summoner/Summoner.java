package com.endive.dummy.data.riot.models.lol.summoner;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.endive.dummy.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Summoner {

    @SerializedName("profileIconId")
    @Expose
    private int profileIconId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("puuid")
    @Expose
    private String puuid;
    @SerializedName("summonerLevel")
    @Expose
    private int summonerLevel;
    @PrimaryKey
    @NonNull
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("revisionDate")
    @Expose
    private long revisionDate;

    public int getProfileIconId() {
        return profileIconId;
    }

    public String getName() {
        return name;
    }

    public String getPuuid() {
        return puuid;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    @NonNull
    public String getAccountId() {
        return accountId;
    }

    public String getId() {
        return id;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public void setAccountId(@NonNull String accountId) {
        this.accountId = accountId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public int getBorderDrawable(){
        if (summonerLevel<30){
            return R.drawable.border_lvl_1;
        } else if (summonerLevel<50){
            return R.drawable.border_lvl_30;
        } else if (summonerLevel<75){
            return R.drawable.border_lvl_50;
        } else if (summonerLevel<100){
            return R.drawable.border_lvl_75;
        } else if (summonerLevel<125){
            return R.drawable.border_lvl_100;
        } else if (summonerLevel<150){
            return R.drawable.border_lvl_125;
        } else if (summonerLevel<175){
            return R.drawable.border_lvl_150;
        } else if (summonerLevel<200){
            return R.drawable.border_lvl_175;
        } else if (summonerLevel<225){
            return R.drawable.border_lvl_200;
        } else if (summonerLevel<250){
            return R.drawable.border_lvl_225;
        } else if (summonerLevel<275){
            return R.drawable.border_lvl_250;
        } else if (summonerLevel<300){
            return R.drawable.border_lvl_275;
        } else if (summonerLevel<325){
            return R.drawable.border_lvl_300;
        } else if (summonerLevel<350){
            return R.drawable.border_lvl_325;
        } else if (summonerLevel<375){
            return R.drawable.border_lvl_350;
        } else if (summonerLevel<400){
            return R.drawable.border_lvl_375;
        } else if (summonerLevel<425){
            return R.drawable.border_lvl_400;
        } else if (summonerLevel<450){
            return R.drawable.border_lvl_425;
        } else if (summonerLevel<475){
            return R.drawable.border_lvl_450;
        } else if (summonerLevel<500){
            return R.drawable.border_lvl_475;
        } else {
            return R.drawable.border_lvl_500;
        }
    }

    public String getProfileIconUrl(){
        return "https://cdn.communitydragon.org/10.10.3216176/profile-icon/" + profileIconId;
    }

    public String getProfileIconPlaceholder(){
        return "https://cdn.communitydragon.org/10.10.3216176/champion/generic/square";
    }
}