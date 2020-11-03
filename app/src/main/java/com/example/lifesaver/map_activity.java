package com.example.lifesaver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class map_activity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    ArrayList<LatLng>arrayList = new ArrayList<LatLng>();

    LatLng Angola = new LatLng(-15.826629, 15.195894);
    LatLng Algeria = new LatLng(32.341948, 4.227236);
    LatLng Mali= new LatLng(16.734099, -3.107129);
    LatLng Morocco= new LatLng(32.577466, -6.371954);
    LatLng Ivory_coast= new LatLng(7.637090, -6.409138);
    LatLng Liberia= new LatLng(5.930828, -7.489239);
    //creat another arraylist for names of markers
    ArrayList<String> title = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_activity);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
//        arrayList.add(Angola);
//        arrayList.add(Mali);
//        arrayList.add(Algeria);
//        arrayList.add(Morocco);
//        arrayList.add(Ivory_coast);
//        arrayList.add(Liberia);
        //Adding data to our array list
        arrayList.add(Angola);
        arrayList.add(Algeria);
        arrayList.add(Mali);
        arrayList.add(Morocco);
        arrayList.add(Ivory_coast);
        arrayList.add(Liberia);
        // Adding titles

        title.add("Angola");
        title.add("Algeria");
        title.add("Mali");
        title.add("Morocco");
        title.add("Ivory_coast");
        title.add("Liberia");



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        for (int i =0; i<arrayList.size(); i++){
            for (int j =0 ; j < title.size() ; j++){
                map.addMarker(new MarkerOptions().position(arrayList.get(i)).title(String.valueOf(title.get(i))));
            }

            map.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
            map.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
        }
        //Adding onClickListner

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {

                String markertitle = marker.getTitle();
                Intent i = new Intent(map_activity.this , DetailsActivity.class);
                i.putExtra("title", markertitle );
                startActivity(i);
                return false;

            }
        });
    }
}