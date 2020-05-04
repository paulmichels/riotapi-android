package com.endive.dummy.model.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class MatchTimeline {

    @SerializedName("frames")
    @Expose
    private List<Frame> frames;
    @SerializedName("frameInterval")
    @Expose
    private Long frameInterval;

    public List<Frame> getFrames() {
        return frames;
    }

    public Long getFrameInterval() {
        return frameInterval;
    }

    public static class Event {

        @SerializedName("itemId")
        @Expose
        private Long itemId;
        @SerializedName("timestamp")
        @Expose
        private Long timestamp;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("participantId")
        @Expose
        private Long participantId;
        @SerializedName("skillSlot")
        @Expose
        private Long skillSlot;
        @SerializedName("levelUpType")
        @Expose
        private String levelUpType;
        @SerializedName("afterId")
        @Expose
        private Long afterId;
        @SerializedName("beforeId")
        @Expose
        private Long beforeId;
        @SerializedName("killerId")
        @Expose
        private Long killerId;
        @SerializedName("victimId")
        @Expose
        private Long victimId;
        @SerializedName("assistingParticipantIds")
        @Expose
        private List<Long> assistingParticipantIds;
        @SerializedName("position")
        @Expose
        private Position position;

        public Long getItemId() {
            return itemId;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public String getType() {
            return type;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public Long getSkillSlot() {
            return skillSlot;
        }

        public String getLevelUpType() {
            return levelUpType;
        }

        public Long getAfterId() {
            return afterId;
        }

        public Long getBeforeId() {
            return beforeId;
        }

        public Long getKillerId() {
            return killerId;
        }

        public Long getVictimId() {
            return victimId;
        }

        public List<Long> getAssistingParticipantIds() {
            return assistingParticipantIds;
        }

        public Position getPosition() {
            return position;
        }
    }

    public static class Frame {

        @SerializedName("timestamp")
        @Expose
        private Long timestamp;
        @SerializedName("participantFrames")
        @Expose
        private HashMap<String, ParticipantFrame> participantFrames;
        @SerializedName("events")
        @Expose
        private List<Event> events;

        public Long getTimestamp() {
            return timestamp;
        }

        public HashMap<String, ParticipantFrame> getParticipantFrames() {
            return participantFrames;
        }

        public List<Event> getEvents() {
            return events;
        }
    }


    public static class Position {

        @SerializedName("y")
        @Expose
        private Long y;
        @SerializedName("x")
        @Expose
        private Long x;

        public Long getY() {
            return y;
        }

        public Long getX() {
            return x;
        }
    }


    public static class ParticipantFrame {

        @SerializedName("totalGold")
        @Expose
        private Long totalGold;
        @SerializedName("teamScore")
        @Expose
        private Long teamScore;
        @SerializedName("participantId")
        @Expose
        private Long participantId;
        @SerializedName("level")
        @Expose
        private Long level;
        @SerializedName("currentGold")
        @Expose
        private Long currentGold;
        @SerializedName("minionsKilled")
        @Expose
        private Long minionsKilled;
        @SerializedName("dominionScore")
        @Expose
        private Long dominionScore;
        @SerializedName("position")
        @Expose
        private Position position;
        @SerializedName("xp")
        @Expose
        private Long xp;
        @SerializedName("jungleMinionsKilled")
        @Expose
        private Long jungleMinionsKilled;

        public Long getTotalGold() {
            return totalGold;
        }

        public Long getTeamScore() {
            return teamScore;
        }

        public Long getParticipantId() {
            return participantId;
        }

        public Long getLevel() {
            return level;
        }

        public Long getCurrentGold() {
            return currentGold;
        }

        public Long getMinionsKilled() {
            return minionsKilled;
        }

        public Long getDominionScore() {
            return dominionScore;
        }

        public Position getPosition() {
            return position;
        }

        public Long getXp() {
            return xp;
        }

        public Long getJungleMinionsKilled() {
            return jungleMinionsKilled;
        }
    }

}