package com.example.bernardo.maps_retrofitapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private SupportMapFragment mMapFragment;
    private GoogleMap mGoogleMap;
    private POI mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mMapFragment.getMapAsync(this);
        ExecuteAsyncRequest();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
    }

    private void addMarker(POI poi){
        LatLng latLng = new LatLng(poi.getLat(),poi.getLng());
        Marker marker = mGoogleMap.addMarker(new MarkerOptions()
                .position(latLng)
                .title(poi.getName())
                .snippet(poi.getAddress()));
    }

    private Retrofit getRetroFit(){
        return new Retrofit.Builder()
                .baseUrl("http://tour-pedia.org/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private TourDataApi getApi(){
        return getRetroFit().create(TourDataApi.class);
    }

    private void ExecuteAsyncRequest(){
        getApi().getListPointsOfInterest("London","attraction","Science")
                .enqueue(new Callback<List<POI>>() {
                    @Override
                    public void onResponse(Call<List<POI>> call, Response<List<POI>> response) {
                        List<POI> points = response.body();
                        for(POI p: points ){
                            addMarker(p);
                        }
                    }

                    @Override
                    public void onFailure(Call<List<POI>> call, Throwable t) {

                    }
                });
    }


}
