package com.endive.dummy;

import com.endive.dummy.data.riot.models.lor.ranked.Leaderboard;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lor.RankedService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class RankedServiceUnitTest {

    @Test
    public void getById() throws IOException {
        RankedService rankedService = RiotApi.getInstance().create(RankedService.class);
        Response<Leaderboard> response = rankedService.getLeaderboard(RiotApi.EUW1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getPlayers());
    }

}
