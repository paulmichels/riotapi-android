package com.endive.dummy.data.riot.network.services.lor;

import com.endive.dummy.data.riot.models.lor.ranked.Leaderboard;
import com.endive.dummy.data.riot.network.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RankedService {

    /**
     * Get the players in Master tier
     * @param region The region
     */
    @GET("{region}/lor/ranked/v1/leaderboards")
    Call<Leaderboard> getLeaderboard(
            @Path("region") @RiotApi.Region String region
    );

}
