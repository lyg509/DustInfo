package com.example.dustinfo.util;

import com.example.dustinfo.model.FineDust;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface FineDustApi {
    String BASE_URL = "https://apis.openapi.sk.com/tmap/";

    @Headers("appKey:l7xxc7311ff01bd1458f9fe5ac5744069b27")
    // 쿼리
    @GET("weather/dust?version=1")
    Call<FineDust> getFineDust(@Query("lat") double latitude,
                               @Query("lon") double longitude);
}