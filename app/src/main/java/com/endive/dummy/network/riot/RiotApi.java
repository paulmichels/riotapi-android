package com.endive.dummy.network.riot;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RiotApi {

    private volatile static Retrofit retrofit;
    private static final String BASE_URL = "https://paulmichels.herokuapp.com/public/index.php/";

    /**
     * Regions
     */
    public static final String BR1 = "br1";
    public static final String EUN1 = "eun1";
    public static final String EUW1 = "euw";
    public static final String JP1 = "jp1";
    public static final String KR = "kr";
    public static final String LA1 = "la1";
    public static final String LA2 = "la2";
    public static final String NA1 = "na1";
    public static final String OC1 = "oc1";
    public static final String TR1 = "tr1";
    public static final String RU = "ru";

    /**
     * Queues
     */
    public static final String RANKED_SOLO_5x5 = "RANKED_SOLO_5x5";
    public static final String RANKED_FLEX_SR = "RANKED_FLEX_SR";
    public static final String RANKED_FLEX_TT = "RANKED_SOLO_TT";

    /**
     * Tiers
     */
    public static final String DIAMOND = "DIAMOND";
    public static final String PLATINUM = "PLATINUM";
    public static final String GOLD = "GOLD";
    public static final String SILVER = "SILVER";
    public static final String BRONZE = "BRONZE";
    public static final String IRON = "IRON";

    /**
     * Divisions
     */
    public static final String DIV_I = "I";
    public static final String DIV_II = "II";
    public static final String DIV_III = "III";
    public static final String DIV_IV = "IV";

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BR1, EUN1, EUW1, JP1, KR, LA1, LA2, NA1, OC1, TR1, RU})
    public @interface Region {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT})
    public @interface Queue{
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, IRON})
    public @interface Tier{
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({DIV_I, DIV_II, DIV_III, DIV_IV})
    public @interface Division{
    }

    public static Retrofit getInstance(){
        if(retrofit == null){
            synchronized (RiotApi.class){
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return retrofit;
    }
}