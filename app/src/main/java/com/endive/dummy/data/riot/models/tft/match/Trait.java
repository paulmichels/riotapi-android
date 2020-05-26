package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trait {

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("num_units")
    private int numUnits;

    @Expose
    @SerializedName("tier_current")
    private int tierCurrent;

    @Expose
    @SerializedName("tier_total")
    private int tierTotal;

    public String getName() {
        return name;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public int getTierCurrent() {
        return tierCurrent;
    }

    public int getTierTotal() {
        return tierTotal;
    }
}
