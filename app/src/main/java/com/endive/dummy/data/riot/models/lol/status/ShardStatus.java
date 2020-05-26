package com.endive.dummy.data.riot.models.lol.status;

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
        private boolean active;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("updates")
        @Expose
        private List<Update> updates;

        public boolean getActive() {
            return active;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public long getId() {
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

}
