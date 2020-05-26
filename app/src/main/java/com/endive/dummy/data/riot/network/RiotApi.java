package com.endive.dummy.data.riot.network;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RiotApi {

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
     * Tournament Regions
     */
    public static final String BR = "BR";
    public static final String EUNE = "EUNE";
    public static final String EUW = "EUW";
    public static final String JP = "JP";
    public static final String LAN = "LAN";
    public static final String LAS = "LAS";
    public static final String NA = "NA";
    public static final String OCE = "OCE";
    public static final String PBE = "PBE";
    public static final String TR = "TR";

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

    /**
     * Pick types
     */
    public static final String BLIND_PICK = "BLIND_PICK";
    public static final String DRAFT_MODE = "DRAFT_MODE";
    public static final String ALL_RANDOM = "ALL_RANDOM";
    public static final String TOURNAMENT_DRAFT = "TOURNAMENT_DRAFT";

    /**
     * Map types
     */
    public static final String SUMMONERS_RIFT = "SUMMONERS_RIFT";
    public static final String TWISTED_TREELINE = "TWISTED_TREELINE";
    public static final String HOWLING_ABYSS = "HOWLING_ABYSS";

    /**
     * Spectator types
     */
    public static final String NONE = "NONE";
    public static final String LOBBYONLY = "LOBBYONLY";
    public static final String ALL = "ALL";

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BR1, EUN1, EUW1, JP1, KR, LA1, LA2, NA1, OC1, TR1, RU})
    public @interface Region {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BR, EUNE, EUW, JP, LAN, LAS, NA, OCE, PBE, RU, TR})
    public @interface TournamentRegion {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({RANKED_SOLO_5x5, RANKED_FLEX_SR, RANKED_FLEX_TT})
    public @interface Queue {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, IRON})
    public @interface Tier {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({DIV_I, DIV_II, DIV_III, DIV_IV})
    public @interface Division {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BLIND_PICK, DRAFT_MODE, ALL_RANDOM, TOURNAMENT_DRAFT})
    public @interface PickType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({SUMMONERS_RIFT, TWISTED_TREELINE, HOWLING_ABYSS})
    public @interface MapType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({NONE, LOBBYONLY, ALL})
    public @interface SpectatorType {
    }

    private static volatile Retrofit INSTANCE;
    private static final String BASE_URL = "https://paulmichels.herokuapp.com/public/index.php/";

    public static Retrofit getInstance(){
        if(INSTANCE == null){
            synchronized (RiotApi.class){
                INSTANCE = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return INSTANCE;
    }
}