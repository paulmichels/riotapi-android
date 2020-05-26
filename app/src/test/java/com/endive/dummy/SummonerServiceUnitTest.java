package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.summoner.Summoner;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.SummonerService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class SummonerServiceUnitTest {

    @Test
    public void getByName() throws IOException {
        SummonerService summonerService = RiotApi.getInstance().create(SummonerService.class);
        Response<Summoner> response = summonerService.getByName(RiotApi.EUW1, UnitTestConstants.SUMMONER_NAME).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }

    @Test
    public void getByAccount() throws IOException {
        SummonerService summonerService = RiotApi.getInstance().create(SummonerService.class);
        Response<Summoner> response = summonerService.getByAccount(RiotApi.EUW1, UnitTestConstants.SUMMONER_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }

    @Test
    public void getByPuuid() throws IOException {
        SummonerService summonerService = RiotApi.getInstance().create(SummonerService.class);
        Response<Summoner> response = summonerService.getByPuuid(RiotApi.EUW1, UnitTestConstants.SUMMONER_PUUID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }

    @Test
    public void get() throws IOException {
        SummonerService summonerService = RiotApi.getInstance().create(SummonerService.class);
        Response<Summoner> response = summonerService.get(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }
}