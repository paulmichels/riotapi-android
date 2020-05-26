package com.endive.dummy.data.riot.network.services.lol;

import com.endive.dummy.data.riot.models.lol.spectator.CurrentGameInfo;
import com.endive.dummy.data.riot.models.lol.spectator.FeaturedGames;
import com.endive.dummy.data.riot.network.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SpectatorService {

    /**
     * Get current game information for the given summoner ID.
     * @param region The region
     * @param encryptedSummonerId Summoner ID associated with the player.
     */
    @GET("{region}/active-games/by-summoner/{encryptedSummonerId}")
    Call<CurrentGameInfo> getActiveGame(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

    /**
     * Get list of featured games.
     * @param region The region
     */
    @GET("{region}/featured-games")
    Call<FeaturedGames> getFeaturedGames(
            @Path("region") @RiotApi.Region String region
    );

}
