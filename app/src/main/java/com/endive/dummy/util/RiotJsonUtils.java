package com.endive.dummy.util;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class RiotJsonUtils {

    public static String getChampionName(Context context, Long champId) throws JSONException {
        String json = getJsonFile(context, "champions");
        String champName = null;
        JSONObject champ = new JSONObject(json);
        JSONArray data = champ.getJSONArray("data");
        for (int i=0; i<data.length(); i++){
            JSONObject champion = data.getJSONObject(i);
            if(champion.getInt("id") == champId){
                champName = champion.getString("key");
            }
        }
        return champName;
    }

    public static String getSummonerSpell(Context context, Long spellId) throws JSONException{
        String json = getJsonFile(context, "summonerspells");
        String spellName = null;
        JSONObject spells = new JSONObject(json);
        JSONArray data = spells.getJSONArray("data");
        for (int i=0; i<data.length(); i++){
            JSONObject spell = data.getJSONObject(i);
            if(spell.getLong("id") == spellId){
                spellName = spell.getString("full");
            }
        }
        return spellName;
    }

    public static String getQueueDescription(Context context, Long queueId) throws JSONException {
        String json = getJsonFile(context, "queues");
        String queue = null;
        JSONArray queues = new JSONArray(json);
        for (int i=0; i<queues.length(); i++){
            JSONObject champion = queues.getJSONObject(i);
            if(champion.getInt("queueId") == queueId){
                queue = champion.getString("description");
            }
        }
        return queue;
    }

    private static String getJsonFile(Context context, String filename){
        String json = null;
        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}