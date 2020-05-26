package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.match.Match;
import com.endive.dummy.data.riot.models.lol.match.MatchList;
import com.endive.dummy.data.riot.models.lol.match.MatchTimeline;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.MatchService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class MatchServiceUnitTest {

    @Test
    public void getById() throws IOException {
        MatchService matchService = RiotApi.getInstance().create(MatchService.class);
        Response<Match> response = matchService.getById(RiotApi.EUW1, UnitTestConstants.GAME_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getGameCreation());
    }

    @Test
    public void getMatchListByAccount() throws IOException {
        MatchService matchService = RiotApi.getInstance().create(MatchService.class);
        Response<MatchList> response = matchService.getMatchListByAccount(RiotApi.EUW1, UnitTestConstants.SUMMONER_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getMatches());
    }

    @Test
    public void getMatchListByAccountWithOptions() throws IOException {
        MatchService matchService = RiotApi.getInstance().create(MatchService.class);
        Response<MatchList> response = matchService.getMatchListByAccount(RiotApi.EUW1, UnitTestConstants.SUMMONER_ACCOUNT_ID, new Integer[]{56, 16}, null, null, null, null, null, null).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getMatches());
    }

    @Test
    public void getTimelines() throws IOException {
        MatchService matchService = RiotApi.getInstance().create(MatchService.class);
        Response<MatchTimeline> response = matchService.getTimelines(RiotApi.EUW1, UnitTestConstants.GAME_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getFrames());
    }
}