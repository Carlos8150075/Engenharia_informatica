package com.example.bernardo.maps_retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Bernardo on 19/12/2017.
 */

public interface TourDataApi {
    @GET("getPlaces")
    Call<List<POI>> getListPointsOfInterest(@Query("location") String location,
                                            @Query("category") String category,
                                            @Query("name") String name);

}
