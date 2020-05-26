package com.endive.dummy.data.riot.network.services.tft;

import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.endive.dummy.data.riot.network.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SummonerService {

    /**
     * Get a summoner by account ID.
     * @param region The region
     * @param encryptedAccountId Summoner ID associated with the player.
     */
    @GET("{region}/tft/summoner/v1/summoners/by-account/{encryptedAccountId}")
    Call<Summoner> getByAccount(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedAccountId") String encryptedAccountId
    );

    /**
     * Get a summoner by summoner name.
     * @param region The region.
     * @param name Summoner Name
     */
    @GET("{region}/tft/summoner/v1/summoners/by-name/{name}")
    Call<Summoner> getByName(
            @Path("region") @RiotApi.Region String region,
            @Path("name") String name
    );

    /**
     * Get a summoner by PUUID.
     * @param region The region.
     * @param encryptedPUUID Summoner ID
     */
    @GET("{region}/tft/summoner/v1/summoners/by-puuid/{encryptedPUUID}")
    Call<Summoner> getByPuuid(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedPUUID") String encryptedPUUID
    );

    /**
     * Get a summoner by summoner ID.
     * @param region The region.
     * @param encryptedSummonerId Summoner ID
     */
    @GET("{region}/tft/summoner/v1/summoners/{encryptedSummonerId}")
    Call<Summoner> get(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

}
