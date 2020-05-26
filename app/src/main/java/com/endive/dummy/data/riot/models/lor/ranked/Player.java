package com.endive.dummy.data.riot.models.lor.ranked;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("players")
    @Expose
    private int rank;

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
