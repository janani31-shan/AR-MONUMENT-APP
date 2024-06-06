package com.techcruz.arappformonuments;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.techcruz.arappformonuments.databinding.ActivityFourthreligiousBinding;

public class fourthreligious extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap,map1,map2,map3,map4;

    ActivityFourthreligiousBinding binding;
    Button fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFourthreligiousBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        fr=findViewById(R.id.fir1);
        fr.setOnClickListener(view -> {
            Intent intent = new Intent(fourthreligious.this, five_religious.class);
            startActivity(intent);
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
        map1=googleMap;
        map2=googleMap;
        map4=googleMap;
        map3=googleMap;

        LatLng brihadeshwaratemple = new LatLng(10.7828, 79.1318);
        mMap.addMarker(new MarkerOptions().position(brihadeshwaratemple).title("Brihadeshwara temple").snippet("Thanjavur,Tamil Nadu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(brihadeshwaratemple));

        LatLng lotustemple = new LatLng(28.5535, 77.2588);
        map1.addMarker(new MarkerOptions().position(lotustemple).title("Lotus temple").snippet("New Delhi,Delhi")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng ramtemple = new LatLng(26.7956, 82.1943);
        map2.addMarker(new MarkerOptions().position(ramtemple).title("Ram mandir").snippet("Ayodhya,Uttar Pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng buddha = new LatLng(24.690472, 84.981806);
        map3.addMarker(new MarkerOptions().position(buddha).title("The Great Buddha").snippet("Bodh Gaya,Bihar")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng bomjesus = new LatLng(15.5009, 73.9116);
        map4.addMarker(new MarkerOptions().position(bomjesus).title("Basilica of Bom Jesus").snippet("Bainguinim, Goa")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
    }
}