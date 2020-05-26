package com.endive.dummy.data.riot.models.lol.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translation {

    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("heading")
    @Expose
    private String heading;

    public String getLocale() {
        return locale;
    }

    public String getContent() {
        return content;
    }

    public String getHeading() {
        return heading;
    }
}
