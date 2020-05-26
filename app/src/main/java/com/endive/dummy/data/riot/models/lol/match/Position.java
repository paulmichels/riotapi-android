package com.endive.dummy.data.riot.models.lol.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("y")
    @Expose
    private long y;
    @SerializedName("x")
    @Expose
    private long x;

    public long getY() {
        return y;
    }

    public long getX() {
        return x;
    }
}
