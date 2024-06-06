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
import com.techcruz.arappformonuments.databinding.ActivityFourthunescoBinding;

public class fourthunesco extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityFourthunescoBinding binding;
    Button fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFourthunescoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        fr=findViewById(R.id.fir1);
        fr.setOnClickListener(view -> {
            Intent intent = new Intent(fourthunesco.this, five_unesco.class);
            startActivity(intent);
        });
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng tajmahal = new LatLng( 27.1751, 78.0421);
        mMap.addMarker(new MarkerOptions().position(tajmahal).title("Taj Mahal")
                .snippet("Agra, Uttar pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng qutubminar = new LatLng(  28.5245 , 77.1855);
        mMap.addMarker(new MarkerOptions().position(qutubminar).title("Qutub Minar")
                .snippet(" New Delhi, Delhi")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


        LatLng elloracave = new LatLng( 20.0258, 75.1780);
        mMap.addMarker(new MarkerOptions().position(elloracave).title("Ellora Caves")
                .snippet("Ellora, Maharastra")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng brihadeshwaratemple = new LatLng(10.7828, 79.1318);
        mMap.addMarker(new MarkerOptions().position(brihadeshwaratemple).title("Brihadeshwara temple")
                .snippet("Thanjavur,Tamil Nadu")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(brihadeshwaratemple));
        LatLng bomjesus = new LatLng(15.5009, 73.9116);
        mMap.addMarker(new MarkerOptions().position(bomjesus).title("Basilica of Bom Jesus")
                .snippet("Bainguinim, Goa")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
    }
}