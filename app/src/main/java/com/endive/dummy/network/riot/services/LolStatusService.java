package com.endive.dummy.network.riot.services;

import com.endive.dummy.model.lolstatus.ShardStatus;
import com.endive.dummy.network.riot.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LolStatusService {

    /**
     * Get League of Legends status for the given shard.
     * @param region The region.
     */
    @GET("{region}/shard-data")
    Call<ShardStatus> getShardData(
            @Path("region") @RiotApi.Region String region
    );

}
