package com.endive.dummy.data.riot.models.lol.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchTimeline {

    @SerializedName("frames")
    @Expose
    private List<Frame> frames;
    @SerializedName("frameInterval")
    @Expose
    private long frameInterval;

    public List<Frame> getFrames() {
        return frames;
    }

    public long getFrameInterval() {
        return frameInterval;
    }


}