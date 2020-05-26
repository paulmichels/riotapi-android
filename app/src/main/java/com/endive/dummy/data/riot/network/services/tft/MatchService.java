package com.endive.dummy.data.riot.network.services.tft;

import com.endive.dummy.data.riot.models.tft.match.Match;
import com.endive.dummy.data.riot.network.RiotApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MatchService {

    @GET("{region}/tft/match/v1/matches/by-puuid/{puuid}/ids")
    Call<List<String>> getByPuuid(
            @Path("region") @RiotApi.Region String region,
            @Path("puuid") String puuid
    );

    @GET("{region}/tft/match/v1/matches/{matchId}")
    Call<Match> getById(
            @Path("region") @RiotApi.Region String region,
            @Path("matchId") long matchId
    );
}
