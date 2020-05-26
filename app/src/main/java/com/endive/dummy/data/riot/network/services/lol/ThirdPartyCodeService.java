package com.endive.dummy.data.riot.network.services.lol;

import com.endive.dummy.data.riot.network.RiotApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ThirdPartyCodeService {

    /**
     * Get third party code for a given summoner ID.
     * @param region The region.
     * @param encryptedSummonerId The account ID.
     */
    @GET("{region}/lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId}")
    Call<String> get(
            @Path("region") @RiotApi.Region String region,
            @Path("encryptedSummonerId") String encryptedSummonerId
    );

}
