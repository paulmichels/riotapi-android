package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.champion.ChampionInfo;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.ChampionService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class ChampionServiceUnitTest {

    @Test
    public void getBySummoner() throws IOException {
        ChampionService championService = RiotApi.getInstance().create(ChampionService.class);
        Response<ChampionInfo> response = championService.getBySummoner(RiotApi.EUW1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getFreeChampionIds());
    }

}