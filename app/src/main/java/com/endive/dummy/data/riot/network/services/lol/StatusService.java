package com.endive.dummy.data.riot.network.services.lol;

import com.endive.dummy.data.riot.models.lol.status.ShardStatus;
import com.endive.dummy.data.riot.network.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StatusService {

    /**
     * Get League of Legends status for the given shard.
     * @param region The region.
     */
    @GET("{region}/shard-data")
    Call<ShardStatus> getShardData(
            @Path("region") @RiotApi.Region String region
    );

}
