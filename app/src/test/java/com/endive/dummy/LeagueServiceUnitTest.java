package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.league.LeagueEntry;
import com.endive.dummy.data.riot.models.lol.league.LeagueList;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.LeagueService;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class LeagueServiceUnitTest {

    @Test
    public void getChallengerLeagues() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<LeagueList> response = leagueService.getChallengerLeagues(RiotApi.EUW1, RiotApi.RANKED_SOLO_5x5).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getEntries());
    }

    @Test
    public void getEntries() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<List<LeagueEntry>> response = leagueService.getEntries(RiotApi.EUW1, RiotApi.RANKED_SOLO_5x5, RiotApi.DIAMOND, RiotApi.DIV_I).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().get(0));
    }

    @Test
    public void getEntriesBySummoner() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<List<LeagueEntry>> response = leagueService.getEntriesBySummoner(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().get(0));
    }

    @Test
    public void getGrandMasterLeagues() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<LeagueList> response = leagueService.getGrandMasterLeagues(RiotApi.EUW1, RiotApi.RANKED_SOLO_5x5).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getEntries());
    }

    @Test
    public void getLeagues() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<LeagueList> response = leagueService.getLeagues(RiotApi.EUW1, UnitTestConstants.LEAGUE_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getEntries());
    }
    @Test
    public void getMasterLeagues() throws IOException {
        LeagueService leagueService = RiotApi.getInstance().create(LeagueService.class);
        Response<LeagueList> response = leagueService.getMasterLeagues(RiotApi.EUW1, RiotApi.RANKED_SOLO_5x5).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getEntries());
    }

}