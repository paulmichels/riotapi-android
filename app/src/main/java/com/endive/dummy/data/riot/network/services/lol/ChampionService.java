package com.endive.dummy.data.riot.network.services.lol;

import com.endive.dummy.data.riot.models.lol.champion.ChampionInfo;
import com.endive.dummy.data.riot.network.RiotApi;

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
