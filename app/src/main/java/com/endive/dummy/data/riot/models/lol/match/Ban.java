package com.endive.dummy.data.riot.models.lol.match;

import android.content.Context;

import com.endive.dummy.util.RiotJsonUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

public class Ban {

    @SerializedName("pickTurn")
    @Expose
    private long pickTurn;
    @SerializedName("championId")
    @Expose
    private long championId;

    public long getPickTurn() {
        return pickTurn;
    }

    public long getChampionId() {
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
