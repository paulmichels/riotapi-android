package com.endive.dummy;

import com.endive.dummy.model.lolstatus.ShardStatus;
import com.endive.dummy.network.riot.RiotApi;
import com.endive.dummy.network.riot.services.LolStatusService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class LolStatusServiceUnitTest {

    @Test
    public void getShardData() throws IOException {
        LolStatusService lolStatusService = RiotApi.getInstance().create(LolStatusService.class);
        Response<ShardStatus> response = lolStatusService.getShardData(RiotApi.EUW1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }
}