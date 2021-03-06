package am2.fbueno.project.pokemonbattle.data.service;

import am2.fbueno.project.pokemonbattle.data.request.AddBattleRequest;
import am2.fbueno.project.pokemonbattle.data.response.AddBattleResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by FBueno on 11/25/2016.
 */

public interface BattleService {
    @Headers({
            "content-type: application/json",
            "application-id: 36ADC0BF-BC45-AF00-FFBB-9F2C409F7200",
            "secret-key: 65E0A253-9DAE-3F98-FF8C-F02429CA7B00",
            "application-type: REST"
    })
    @POST("/v1/data/UserBattle")
    Call<AddBattleResponse> addBattle(@Body AddBattleRequest battleDetail);
}
