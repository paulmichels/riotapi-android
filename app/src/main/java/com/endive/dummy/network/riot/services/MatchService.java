package com.endive.dummy.network.riot.services;

import com.endive.dummy.model.match.Match;
import com.endive.dummy.model.match.MatchList;
import com.endive.dummy.model.match.MatchTimeline;
import com.endive.dummy.network.riot.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MatchService {

    /**
     * Get match by match ID.
     * @param region The region.
     * @param matchId The match ID.
     */
    @GET("{region}/matches/{matchId}")
    Call<Match> getById(
            @Path("region") @RiotApi.Region String region,
            @Path("matchId") long matchId
    );

    /**
     * Get matchlist for games played on given account ID and platform ID
     * @param region The region.
     * @param encryptedSummonerId The account ID.
     */
    @GET("{region}/matchlists/by-account/{encryptedSummonerId}")
    Call<MatchList> getMatchListByAccount(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

    /**
     * Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.
     * @param region The region.
     * @param encryptedSummonerId The account ID.
     * @param champions Set of champion IDs for filtering the matchlist.
     * @param queue Set of queue IDs for filtering the matchlist.
     * @param season Set of season IDs for filtering the matchlist.
     * @param endTime The end time to use for filtering matchlist specified as epoch milliseconds.
     *                If beginTime is specified, but not endTime, then endTime defaults to the the
     *                current unix timestamp in milliseconds (the maximum time range limitation is
     *                not observed in this specific case). If endTime is specified, but not beginTime,
     *                then beginTime defaults to the start of the account's match history returning a 400
     *                due to the maximum time range limitation. If both are specified, then endTime should
     *                be greater than beginTime. The maximum time range allowed is one week, otherwise
     *                a 400 error code is returned.
     * @param beginTime The begin time to use for filtering matchlist specified as epoch milliseconds.
     *                  If beginTime is specified, but not endTime, then endTime defaults to the
     *                  current unix timestamp in milliseconds (the maximum time range limitation is
     *                  not observed in this specific case). If endTime is specified, but not beginTime,
     *                  then beginTime defaults to the start of the account's match history returning a 400
     *                  due to the maximum time range limitation. If both are specified, then endTime
     *                  should be greater than beginTime. The maximum time range allowed is one week, otherwise
     *                  a 400 error code is returned.
     * @param endIndex The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex,
     *                 then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex,
     *                 then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex.
     *                 The maximum range allowed is 100, otherwise a 400 error code is returned.
     * @param beginIndex The begin index to use for filtering matchlist. If beginIndex is specified, but not endIndex,
     *                   then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex,
     *                   then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex.
     *                   The maximum range allowed is 100, otherwise a 400 error code is returned.
     */
    @GET("{region}/matchlists/by-account/{encryptedSummonerId}")
    Call<MatchList> getMatchListByAccount(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId,
            @Query("champion") Integer[] champions,
            @Query("queue") Integer[] queue,
            @Query("season") Integer[] season,
            @Query("endTime") Long endTime,
            @Query("beginTime") Long beginTime,
            @Query("endIndex") Long endIndex,
            @Query("beginIndex") Long beginIndex
    );

    /**
     * Get match timeline by match ID.
     * @param region The region.
     * @param matchId The match ID.
     */
    @GET("{region}/timelines/by-match/{matchId}")
    Call<MatchTimeline> getTimelines(
            @Path("region") @RiotApi.Region String region,
            @Path("matchId") long matchId
    );

}
