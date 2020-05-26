package com.endive.dummy.data.riot.network.services.lol;

import androidx.annotation.IntRange;

import com.endive.dummy.data.riot.models.lol.tournament.LobbyEventWrapper;
import com.endive.dummy.data.riot.network.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TournamentStubService {

    /**
     * Create a mock tournament code for the given tournament.
     * @param region The region.
     * @param mapType The map type of the game.
     * @param pickType The pick type of the game.
     * @param spectatorType The spectator type of the game.
     * @param teamSize The team size of the game. Valid values are 1-5.
     */
    @POST("{region}/lol/tournament-stub/v4/codes")
    Call<List<String>> createCode(
            @Path("region") @RiotApi.Region String region,
            @Body @RiotApi.MapType String mapType,
            @Body @RiotApi.PickType String pickType,
            @Body @RiotApi.SpectatorType String spectatorType,
            @Body @IntRange(from = 1, to = 5) int teamSize
    );

    /**
     * Create a mock tournament code for the given tournament.
     * @param region The region.
     * @param allowedSummonerIds Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby.
     * @param mapType The map type of the game.
     * @param metadata Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game.
     * @param pickType The pick type of the game.
     * @param spectatorType The spectator type of the game.
     * @param teamSize The team size of the game. Valid values are 1-5.
     */
    @POST("{region}/lol/tournament-stub/v4/codes")
    Call<List<String>> createCode(
            @Path("region") @RiotApi.Region String region,
            @Body String[] allowedSummonerIds,
            @Body @RiotApi.MapType String mapType,
            @Body String metadata,
            @Body @RiotApi.PickType String pickType,
            @Body @RiotApi.SpectatorType String spectatorType,
            @Body @IntRange(from = 1, to = 5) int teamSize
    );

    /**
     * Gets a mock list of lobby events by tournament code
     * @param region The region.
     * @param tournamentCode The short code to look up lobby events for.
     */
    @GET("{region}/lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode}")
    Call<LobbyEventWrapper> getLobbies(
            @Path("region") @RiotApi.Region String region,
            @Path("tournamentCode") String tournamentCode
        );

    /**
     * Creates a mock tournament provider and returns its ID.
     * @param region The region in which the provider will be running tournaments.
     * @param tournamentRegion The region in which the provider will be running tournaments.
     * @param url The provider's callback URL to which tournament game results in this region should be posted.
     */
    @POST("{region}/lol/tournament-stub/v4/providers")
    Call<Integer> postProvider(
            @Path("region") @RiotApi.Region String region,
            @Body @RiotApi.TournamentRegion String tournamentRegion,
            @Body String url

    );

    /**
     * Creates a mock tournament and returns its ID.
     * @param region The region.
     * @param providerId The provider ID to specify the regional registered provider data to associate this tournament.
     */
    @POST("{region}/lol/tournament-stub/v4/codes")
    Call<Integer> postTournament(
            @Path("region") @RiotApi.Region String region,
            @Body int providerId
    );

    /**
     * Creates a mock tournament and returns its ID.
     * @param region The region.
     * @param providerId The provider ID to specify the regional registered provider data to associate this tournament.
     * @param name The optional name of the tournament.
     */
    @POST("{region}/lol/tournament-stub/v4/codes")
    Call<Integer> postTournament(
            @Path("region") @RiotApi.Region String region,
            @Body int providerId,
            @Body String name
    );

}
