package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

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
    private long profileIcon;
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

    public long getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(long profileIcon) {
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
