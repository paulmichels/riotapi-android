package com.endive.dummy.data.riot.models.lol.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Update {

    @SerializedName("severity")
    @Expose
    private String severity;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("translations")
    @Expose
    private List<Translation> translations;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("heading")
    @Expose
    private String heading;

    public String getSeverity() {
        return severity;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getHeading() {
        return heading;
    }
}
