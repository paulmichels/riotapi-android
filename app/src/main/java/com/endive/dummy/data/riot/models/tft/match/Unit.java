package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Unit {

    @Expose
    @SerializedName("items")
    private List<Integer> items;

    @Expose
    @SerializedName("character_id")
    private int characterId;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("rarity")
    private int rarity;

    @Expose
    @SerializedName("tier")
    private int tier;

    public List<Integer> getItems() {
        return items;
    }

    public int getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    public int getTier() {
        return tier;
    }
}
