package com.endive.dummy.data.riot.network.services.lol;

import com.endive.dummy.data.riot.models.lol.league.LeagueEntry;
import com.endive.dummy.data.riot.models.lol.league.LeagueList;
import com.endive.dummy.data.riot.network.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LeagueService {

    /**
     * Get the challenger league for given queue.
     * @param region The region.
     * @param queue The queue.
     */
    @GET("{region}/challengerleagues/by-queue/{queue}")
    Call<LeagueList> getChallengerLeagues(
            @Path("region") @RiotApi.Region String region,
            @Path("queue") @RiotApi.Queue String queue
    );

    /**
     * Get league entries in all queues for a given summoner ID.
     * @param region The region.
     * @param encryptedSummonerId Summoner ID associated with the player.
     */
    @GET("{region}/entries/by-summoner/{encryptedSummonerId}")
    Call<List<LeagueEntry>> getEntriesBySummoner (
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

    /**
     * Get all the league entries.
     * @param region The region.
     * @param queue The queue.
     * @param tier The tier.
     * @param division The division.
     */
    @GET("{region}/entries/{queue}/{tier}/{division}")
    Call<List<LeagueEntry>> getEntries(
            @Path("region") @RiotApi.Region String region,
            @Path("queue") @RiotApi.Queue String queue,
            @Path("tier") @RiotApi.Tier String tier,
            @Path("division") @RiotApi.Division String division
    );

    /**
     * Get the grandmaster league of a specific queue.
     * @param region The region.
     * @param queue The queue.
     */
    @GET("{region}/grandmasterleagues/by-queue/{queue}")
    Call<LeagueList> getGrandMasterLeagues(
            @Path("region") @RiotApi.Region String region,
            @Path("queue") @RiotApi.Queue String queue
    );

    /**
     * Get league with given ID, including inactive entries.
     * @param region The region.
     * @param leagueId The UUID of the league.
     */
    @GET("{region}/leagues/{leagueId}")
    Call<LeagueList> getLeagues(
            @Path("region") @RiotApi.Region String region,
            @Path("leagueId") String leagueId
    );

    /**
     * Get the master league for given queue.
     * @param region The region.
     * @param queue The queue.
     */
    @GET("{region}/masterleagues/by-queue/{queue}")
    Call<LeagueList> getMasterLeagues(
            @Path("region") @RiotApi.Region String region,
            @Path("queue") String queue
    );

}
