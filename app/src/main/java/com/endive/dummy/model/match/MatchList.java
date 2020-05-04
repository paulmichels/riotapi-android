package com.endive.dummy.model.match;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.endive.dummy.R;
import com.endive.dummy.util.RiotJsonUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MatchList implements Parcelable {

    @SerializedName("matches")
    @Expose
    private List<Match> matches;
    @SerializedName("endIndex")
    @Expose
    private Long endIndex;
    @SerializedName("startIndex")
    @Expose
    private Long startIndex;
    @SerializedName("totalGames")
    @Expose
    private Long totalGames;

    protected MatchList(Parcel in) {
        matches = in.createTypedArrayList(Match.CREATOR);
        if (in.readByte() == 0) {
            endIndex = null;
        } else {
            endIndex = in.readLong();
        }
        if (in.readByte() == 0) {
            startIndex = null;
        } else {
            startIndex = in.readLong();
        }
        if (in.readByte() == 0) {
            totalGames = null;
        } else {
            totalGames = in.readLong();
        }
    }

    public static final Creator<MatchList> CREATOR = new Creator<MatchList>() {
        @Override
        public MatchList createFromParcel(Parcel in) {
            return new MatchList(in);
        }

        @Override
        public MatchList[] newArray(int size) {
            return new MatchList[size];
        }
    };

    public List<Match> getMatches() {
        return matches;
    }

    public Long getEndIndex() {
        return endIndex;
    }

    public Long getStartIndex() {
        return startIndex;
    }

    public Long getTotalGames() {
        return totalGames;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(matches);
        if (endIndex == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(endIndex);
        }
        if (startIndex == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(startIndex);
        }
        if (totalGames == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(totalGames);
        }
    }

    public static class Match implements Parcelable {

        @SerializedName("lane")
        @Expose
        private String lane;
        @SerializedName("gameId")
        @Expose
        private Long gameId;
        @SerializedName("champion")
        @Expose
        private Long champion;
        @SerializedName("platformId")
        @Expose
        private String platformId;
        @SerializedName("timestamp")
        @Expose
        private Long timestamp;
        @SerializedName("queue")
        @Expose
        private Long queue;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("season")
        @Expose
        private Long season;

        protected Match(Parcel in) {
            lane = in.readString();
            if (in.readByte() == 0) {
                gameId = null;
            } else {
                gameId = in.readLong();
            }
            if (in.readByte() == 0) {
                champion = null;
            } else {
                champion = in.readLong();
            }
            platformId = in.readString();
            if (in.readByte() == 0) {
                timestamp = null;
            } else {
                timestamp = in.readLong();
            }
            if (in.readByte() == 0) {
                queue = null;
            } else {
                queue = in.readLong();
            }
            role = in.readString();
            if (in.readByte() == 0) {
                season = null;
            } else {
                season = in.readLong();
            }
        }

        public static final Creator<Match> CREATOR = new Creator<Match>() {
            @Override
            public Match createFromParcel(Parcel in) {
                return new Match(in);
            }

            @Override
            public Match[] newArray(int size) {
                return new Match[size];
            }
        };

        public String getLane() {
            return lane;
        }

        public Long getGameId() {
            return gameId;
        }

        public Long getChampion() {
            return champion;
        }

        public String getPlatformId() {
            return platformId;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public Long getQueue() {
            return queue;
        }

        public String getRole() {
            return role;
        }

        public Long getSeason() {
            return season;
        }

        public String getChampionImageUrl(Context context){
            try {
                return "http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + RiotJsonUtils.getChampionName(context, champion) + ".png";
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @BindingAdapter("getReadableDate")
        public static void getReadableDate(TextView textView, Long timestamp) {
            Date date = new Date(timestamp);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
            textView.setText(sdf.format(date));
        }

        @BindingAdapter("loadChampionImage")
        public static void loadImage(ImageView imageView, String imageUrl) {
            Glide.with(imageView.getContext())
                    .load(imageUrl).apply(new RequestOptions().circleCrop())
                    .into(imageView);
        }

        @BindingAdapter("loadLaneIcon")
        public static void loadLaneIcon(ImageView imageView, String lane) {
            int resId = 0;
            switch (lane){
                case "TOP":
                    resId = R.drawable.position_iron_top;
                    break;

                case "JUNGLE":
                    resId = R.drawable.position_iron_jungle;
                    break;

                case "MID":
                    resId = R.drawable.position_iron_mid;
                    break;

                case "BOTTOM":
                    resId = R.drawable.position_iron_bot;
                    break;

                case "SUPPORT":
                    resId = R.drawable.position_iron_support;
                    break;
            }
            if(resId != 0) {
                Glide.with(imageView)
                        .load(imageView.getResources().getDrawable(resId))
                        .into(imageView);
            }
        }

        @BindingAdapter("getQueueDescription")
        public static void getQueueDescription(TextView textView, Long queueId) {
            try {
                textView.setText(RiotJsonUtils.getQueueDescription(textView.getContext(), queueId));
            } catch (JSONException e) {
                e.printStackTrace();
                textView.setText(textView.getResources().getString(R.string.unknown_queue_type));
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(lane);
            if (gameId == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeLong(gameId);
            }
            if (champion == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeLong(champion);
            }
            dest.writeString(platformId);
            if (timestamp == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeLong(timestamp);
            }
            if (queue == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeLong(queue);
            }
            dest.writeString(role);
            if (season == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeLong(season);
            }
        }
    }

}
