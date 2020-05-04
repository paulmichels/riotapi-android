package com.endive.dummy.model.lolstatus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShardStatus {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("region_tag")
    @Expose
    private String regionTag;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("services")
    @Expose
    private List<Service> services;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("locales")
    @Expose
    private List<String> locales;

    public String getName() {
        return name;
    }

    public String getRegionTag() {
        return regionTag;
    }

    public String getHostname() {
        return hostname;
    }

    public List<Service> getServices() {
        return services;
    }

    public String getSlug() {
        return slug;
    }

    public List<String> getLocales() {
        return locales;
    }

    public static class Incident {

        @SerializedName("active")
        @Expose
        private Boolean active;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("updates")
        @Expose
        private List<Update> updates;

        public Boolean getActive() {
            return active;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public Long getId() {
            return id;
        }

        public List<Update> getUpdates() {
            return updates;
        }
    }

    public static class Service {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("incidents")
        @Expose
        private List<Incident> incidents;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("slug")
        @Expose
        private String slug;

        public String getStatus() {
            return status;
        }

        public List<Incident> getIncidents() {
            return incidents;
        }

        public String getName() {
            return name;
        }

        public String getSlug() {
            return slug;
        }
    }

    public static class Translation {

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

    public static class Update {

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

}
