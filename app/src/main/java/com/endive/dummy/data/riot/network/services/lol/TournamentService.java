package com.endive.dummy.data.riot.network.services.lol;

import androidx.annotation.IntRange;

import com.endive.dummy.data.riot.models.lol.tournament.TournamentCode;
import com.endive.dummy.data.riot.network.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TournamentService {

    /**
     * Create a mock tournament code for the given tournament.
     * @param region The region.
     * @param tournamentId The tournament ID.
     * @param mapType The map type of the game.
     * @param pickType The pick type of the game.
     * @param spectatorType The spectator type of the game.
     * @param teamSize The team size of the game. Valid values are 1-5.
     */
    @POST("{region}/lol/tournament/v4/codes")
    Call<List<String>> createCode(
            @Path("region") @RiotApi.Region String region,
            @Query("tournamentId") long tournamentId,
            @Field("mapType") @RiotApi.MapType String mapType,
            @Field("pickType") @RiotApi.PickType String pickType,
            @Field("spectatorType") @RiotApi.SpectatorType String spectatorType,
            @Field("teamSize") @IntRange(from = 1, to = 5) int teamSize
    );

    /**
     * Create a mock tournament code for the given tournament.
     * @param region The region.
     * @param tournamentId The tournament ID.
     * @param count The number of codes to create (max 1000).
     * @param allowedSummonerIds Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby.
     * @param mapType The map type of the game.
     * @param metadata Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game.
     * @param pickType The pick type of the game.
     * @param spectatorType The spectator type of the game.
     * @param teamSize The team size of the game. Valid values are 1-5.
     */
    @POST("{region}/lol/tournament/v4/codes")
    Call<List<String>> createCode(
            @Path("region") @RiotApi.Region String region,
            @Query("tournamentId") long tournamentId,
            @Query("count") @IntRange(from = 1, to = 1000) int count,
            @Body String[] allowedSummonerIds,
            @Body @RiotApi.MapType String mapType,
            @Body String metadata,
            @Body @RiotApi.PickType String pickType,
            @Body @RiotApi.SpectatorType String spectatorType,
            @Body @IntRange(from = 1, to = 5) int teamSize
    );

    /**
     * Returns the tournament code associated with a tournament code string
     * @param region The region.
     * @param tournamentCode The tournament code string.
     */
    @GET("{region}/lol/tournament/v4/codes/{tournamentCode}")
    Call<TournamentCode> getCode(
            @Path("region") @RiotApi.Region String region,
            @Path("tournamentCode") String tournamentCode
    );

    /**
     * Creates a mock tournament provider and returns its ID.
     * @param region The region in which the provider will be running tournaments.
     * @param tournamentCode The tournament code string.
     */
    @PUT("{region}/lol/tournament/v4/codes/{tournamentCode}")
    Call updateCode(
            @Path("region") @RiotApi.Region String region,
            @Path("tournamentCode") String tournamentCode
    );

    /**
     * Update the pick type, map, spectator type, or allowed summoners for a code.
     * @param region The region in which the provider will be running tournaments.
     * @param tournamentCode The tournament code string.
     * @param allowedSummonerIds Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby.
     * @param mapType The map type of the game.
     * @param pickType The pick type of the game.
     * @param spectatorType The spectator type of the game.
     */
    @PUT("{region}/lol/tournament/v4/codes/{tournamentCode}")
    Call updateCode(
            @Path("region") @RiotApi.Region String region,
            @Path("tournamentCode") String tournamentCode,
            @Body String[] allowedSummonerIds,
            @Body @RiotApi.PickType String pickType,
            @Body @RiotApi.MapType String mapType,
            @Body @RiotApi.SpectatorType String spectatorType
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
    @POST("{region}/lol/tournament/v4/codes")
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
    @POST("{region}/lol/tournament/v4/codes")
    Call<Integer> postTournament(
            @Path("region") @RiotApi.Region String region,
            @Body int providerId,
            @Body String name
    );

}
