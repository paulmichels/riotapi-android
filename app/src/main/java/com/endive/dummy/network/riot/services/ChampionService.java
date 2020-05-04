package com.endive.dummy.network.riot.services;

import com.endive.dummy.model.champion.ChampionInfo;
import com.endive.dummy.network.riot.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChampionService {

    /**
     * Returns champion rotations, including free-to-play and low-level free-to-play rotations.
     * @param region The region.
     */
    @GET("{region}/champion-rotations")
    Call<ChampionInfo> getBySummoner(
            @Path("region") @RiotApi.Region String region
    );

}
