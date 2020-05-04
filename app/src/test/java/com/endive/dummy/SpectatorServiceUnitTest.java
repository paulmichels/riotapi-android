package com.endive.dummy;

import com.endive.dummy.model.spectator.CurrentGameInfo;
import com.endive.dummy.model.spectator.FeaturedGames;
import com.endive.dummy.network.riot.RiotApi;
import com.endive.dummy.network.riot.services.SpectatorService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class SpectatorServiceUnitTest {

    @Test
    public void getActiveGame() throws IOException {
        SpectatorService spectatorService = RiotApi.getInstance().create(SpectatorService.class);
        Response<CurrentGameInfo> response = spectatorService.getActiveGame(RiotApi.EUW1, UnitTestConstants.SUMMONER_ENCRYPTED_ACCOUNT_ID).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getBannedChampions());
    }

    @Test
    public void getFeaturedGames() throws IOException {
        SpectatorService spectatorService = RiotApi.getInstance().create(SpectatorService.class);
        Response<FeaturedGames> response = spectatorService.getFeaturedGames(RiotApi.EUW1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getGameList());
    }

}