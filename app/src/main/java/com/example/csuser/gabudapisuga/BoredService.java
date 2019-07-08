package com.example.csuser.gabudapisuga;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BoredService {
    @GET("/api/activity/")
    Call<Bored> getRandomBored();
}
