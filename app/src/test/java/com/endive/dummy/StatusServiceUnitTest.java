package com.endive.dummy;

import com.endive.dummy.data.riot.models.lol.status.ShardStatus;
import com.endive.dummy.data.riot.network.RiotApi;
import com.endive.dummy.data.riot.network.services.lol.StatusService;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class StatusServiceUnitTest {

    @Test
    public void getShardData() throws IOException {
        StatusService statusService = RiotApi.getInstance().create(StatusService.class);
        Response<ShardStatus> response = statusService.getShardData(RiotApi.EUW1).execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getName());
    }
}