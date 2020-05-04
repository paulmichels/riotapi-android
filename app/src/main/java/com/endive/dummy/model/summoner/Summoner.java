package com.endive.dummy.model.summoner;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.endive.dummy.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summoner implements Parcelable {

    @SerializedName("profileIconId")
    @Expose
    private int profileIconId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("puuid")
    @Expose
    private String puuid;
    @SerializedName("summonerLevel")
    @Expose
    private int summonerLevel;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("revisionDate")
    @Expose
    private long revisionDate;

    protected Summoner(Parcel in) {
        profileIconId = in.readInt();
        name = in.readString();
        puuid = in.readString();
        summonerLevel = in.readInt();
        accountId = in.readString();
        id = in.readString();
        revisionDate = in.readLong();
    }

    public static final Creator<Summoner> CREATOR = new Creator<Summoner>() {
        @Override
        public Summoner createFromParcel(Parcel in) {
            return new Summoner(in);
        }

        @Override
        public Summoner[] newArray(int size) {
            return new Summoner[size];
        }
    };

    public int getProfileIconId() {
        return profileIconId;
    }

    public String getName() {
        return name;
    }

    public String getPuuid() {
        return puuid;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getId() {
        return id;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public String getProfileIconUrl(){
        return "http://ddragon.leagueoflegends.com/cdn/9.24.2/img/profileicon/"+getProfileIconId()+".png";
    }

    @BindingAdapter("loadProfileIcon")
    public static void loadProfileIcon(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }

    @BindingAdapter("borderIcon")
    public static void loadBorder(ImageView view, int summonerLevel) {
        view.setImageDrawable(view.getContext().getDrawable(getBorderDrawable(summonerLevel)));
    }

    private static int getBorderDrawable(int summonerLevel){
        if (summonerLevel<30){
            return R.drawable.border_lvl_1;
        } else if (summonerLevel<50){
            return R.drawable.border_lvl_30;
        } else if (summonerLevel<75){
            return R.drawable.border_lvl_50;
        } else if (summonerLevel<100){
            return R.drawable.border_lvl_75;
        } else if (summonerLevel<125){
            return R.drawable.border_lvl_100;
        } else if (summonerLevel<150){
            return R.drawable.border_lvl_125;
        } else if (summonerLevel<175){
            return R.drawable.border_lvl_150;
        } else if (summonerLevel<200){
            return R.drawable.border_lvl_175;
        } else if (summonerLevel<225){
            return R.drawable.border_lvl_200;
        } else if (summonerLevel<250){
            return R.drawable.border_lvl_225;
        } else if (summonerLevel<275){
            return R.drawable.border_lvl_250;
        } else if (summonerLevel<300){
            return R.drawable.border_lvl_275;
        } else if (summonerLevel<325){
            return R.drawable.border_lvl_300;
        } else if (summonerLevel<350){
            return R.drawable.border_lvl_325;
        } else if (summonerLevel<375){
            return R.drawable.border_lvl_350;
        } else if (summonerLevel<400){
            return R.drawable.border_lvl_375;
        } else if (summonerLevel<425){
            return R.drawable.border_lvl_400;
        } else if (summonerLevel<450){
            return R.drawable.border_lvl_425;
        } else if (summonerLevel<475){
            return R.drawable.border_lvl_450;
        } else if (summonerLevel<500){
            return R.drawable.border_lvl_475;
        } else {
            return R.drawable.border_lvl_500;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(profileIconId);
        dest.writeString(name);
        dest.writeString(puuid);
        dest.writeInt(summonerLevel);
        dest.writeString(accountId);
        dest.writeString(id);
        dest.writeLong(revisionDate);
    }
}