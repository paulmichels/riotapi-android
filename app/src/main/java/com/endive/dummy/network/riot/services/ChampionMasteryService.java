package com.endive.dummy.network.riot.services;

import com.endive.dummy.model.championmastery.ChampionMastery;
import com.endive.dummy.network.riot.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChampionMasteryService {

    /**
     * Get all champion mastery entries sorted by number of champion points descending
     * @param region The region.
     * @param encryptedSummonerId Summoner ID associated with the player.
     */
    @GET("{region}/champion-masteries/by-summoner/{encryptedSummonerId}")
    Call<List<ChampionMastery>> getBySummoner(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

    /**
     * Get a champion mastery by player ID and champion ID
     * @param region The region.
     * @param encryptedSummonerId Summoner ID associated with the player.
     * @param championId Champion ID to retrieve Champion Mastery for.
     */
    @GET("{region}/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId}")
    Call<ChampionMastery> getBySummonerByChampion(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId,
            @Path("championId") long championId
    );

    /**
     * Get a player's total champion mastery score, which is the sum of individual champion mastery levels
     * @param region The region.
     * @param encryptedSummonerId Summoner ID associated with the player.
     */
    @GET("{region}/scores/by-summoner/{encryptedSummonerId}")
    Call<Integer> getScore(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

}
