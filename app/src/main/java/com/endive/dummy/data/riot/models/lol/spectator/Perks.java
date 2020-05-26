package com.endive.dummy.data.riot.models.lol.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Perks {

    @SerializedName("perkStyle")
    @Expose
    private long perkStyle;
    @SerializedName("perkIds")
    @Expose
    private List<Long> perkIds;
    @SerializedName("perkSubStyle")
    @Expose
    private long perkSubStyle;

    public long getPerkStyle() {
        return perkStyle;
    }

    public List<Long> getPerkIds() {
        return perkIds;
    }

    public long getPerkSubStyle() {
        return perkSubStyle;
    }
}
