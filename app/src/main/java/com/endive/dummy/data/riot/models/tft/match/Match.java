package com.endive.dummy.data.riot.models.tft.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @Expose
    @SerializedName("metadata")
    private Metadata metadata;

    @Expose
    @SerializedName("info")
    private Info info;

    public Metadata getMetadata() {
        return metadata;
    }

    public Info getInfo() {
        return info;
    }
}
