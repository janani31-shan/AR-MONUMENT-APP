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
import com.techcruz.arappformonuments.databinding.ActivityFourthstatueBinding;

public class fourthstatue extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityFourthstatueBinding binding;
    Button fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFourthstatueBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        fr=findViewById(R.id.fir1);
        fr.setOnClickListener(view -> {
            Intent intent = new Intent(fourthstatue.this, five_statue.class);
            startActivity(intent);
        });

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng statueofunity = new LatLng( 21.8380, 73.7191);
        mMap.addMarker(new MarkerOptions().position(statueofunity).title("Statue of unity").snippet("Kevadia,Gujarat")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        LatLng adiyogishiva = new LatLng(10.972416, 76.740602);
        mMap.addMarker(new MarkerOptions().position(adiyogishiva).title("Adiyogi shiva").snippet("Coimbatore,Tamil Nadu")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        LatLng buddha = new LatLng(24.690472, 84.981806);
        mMap.addMarker(new MarkerOptions().position(buddha).title("The Great Buddha").snippet(" Bodh Gaya, Bihar")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        LatLng ataltunnel = new LatLng(32.40127, 77.148335);
        mMap.addMarker(new MarkerOptions().position(ataltunnel).title("Atal tunnel").snippet("Rohtang pass ,Himachal Pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ataltunnel));
        LatLng ashokpillar = new LatLng(28.673862, 77.211839);
        mMap.addMarker(new MarkerOptions().position(ashokpillar).title("Ashoka Pillar").snippet("Ashoka Pillar, Delhi - NCR")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ashokpillar));


    }
}