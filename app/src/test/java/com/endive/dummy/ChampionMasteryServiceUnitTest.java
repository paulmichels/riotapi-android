package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.championmastery.ChampionMastery;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.ChampionMasteryService;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class ChampionMasteryServiceUnitTest {

    @Test
    public void getBySummoner() throws IOException {
        ChampionMasteryService championMasteryService = RiotApi.getInstance().create(ChampionMasteryService.class);
        Response<List<ChampionMastery>> response = championMasteryService.getBySummoner(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().get(0));
    }

    @Test
    public void getBySummonerByChampion() throws IOException {
        ChampionMasteryService championMasteryService = RiotApi.getInstance().create(ChampionMasteryService.class);
        Response<ChampionMastery> response = championMasteryService.getBySummonerByChampion(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID, 1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getChampionId());
    }

    @Test
    public void getScore() throws IOException {
        ChampionMasteryService championMasteryService = RiotApi.getInstance().create(ChampionMasteryService.class);
        Response<Integer> response = championMasteryService.getScore(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
    }
}