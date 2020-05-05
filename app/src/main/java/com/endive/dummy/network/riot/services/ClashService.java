package com.endive.dummy.network.riot.services;

import com.endive.dummy.model.clash.Tournament;
import com.endive.dummy.model.match.Match;
import com.endive.dummy.network.riot.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ClashService {

    /**
     * Get players by summoner ID. This endpoint returns a list of active Clash players for a given summoner ID.
     * If a summoner registers for multiple tournaments at the same time (e.g., Saturday and Sunday)
     * then both registrations would appear in this list.
     * @param region The region.
     * @param summonerId The account ID.
     */
    @GET("{region}/lol/clash/v1/players/by-summoner/{summonerId}")
    Call<List<Match.Player>> getBySummoner(
            @Path("region") @RiotApi.Region String region,
            @Path("summonerId") String summonerId
    );

    /**
     * Get team by ID.
     * @param region The region.
     * @param teamId The team ID.
     */
    @GET("{region}/lol/clash/v1/teams/{teamId}")
    Call<Match.Team> getTeam(
            @Path("region") @RiotApi.Region String region,
            @Path("teamId") String teamId
    );

    /**
     * Get all active or upcoming tournaments.
     * @param region The region.
     */
    @GET("{region}/lol/clash/v1/tournaments")
    Call<List<Tournament>> getTournaments(
            @Path("region") @RiotApi.Region String region
    );

    /**
     * Get tournament by team ID.
     * @param region The region.
     * @param teamId The team ID.
     */
    @GET("{region}/lol/clash/v1/tournaments/by-team/{teamId}")
    Call<Tournament> getTournamentByTeam(
            @Path("region") @RiotApi.Region String region,
            @Path("teamId") String teamId
    );

    /**
     * Get tournament by ID
     * @param region The region.
     * @param tournamentId The tournament ID.
     */
    @GET("{region}/lol/clash/v1/tournaments/{tournamentId}")
    Call<Tournament> getTournamentByID(
            @Path("region") @RiotApi.Region String region,
            @Path("tournamentId") int tournamentId
    );
}
