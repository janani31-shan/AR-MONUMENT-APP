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
import com.techcruz.arappformonuments.databinding.ActivityFourtharchaeBinding;

public class fourtharchae extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityFourtharchaeBinding binding;
    Button fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFourtharchaeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        fr=findViewById(R.id.fir1);
        fr.setOnClickListener(view -> {
            Intent intent = new Intent(fourtharchae.this, five_archaeological.class);
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

        LatLng brihadeshwaratemple = new LatLng(10.7828, 79.1318);
        mMap.addMarker(new MarkerOptions().position(brihadeshwaratemple).title("Brihadeshwara temple")
                .snippet("Thanjavur,Tamil Nadu")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(brihadeshwaratemple));
        LatLng greatstupa = new LatLng(23.479223,77.739683);
        mMap.addMarker(new MarkerOptions().position(greatstupa).title("The Great Stupa")
                .snippet("Sanchi,madhya pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        LatLng elloracave = new LatLng( 20.0258, 75.1780);
        mMap.addMarker(new MarkerOptions().position(elloracave).title("Ellora Caves")
                .snippet("Ellora, Maharastra")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        LatLng tajmahal= new LatLng( 27.1751, 78.0421);
        mMap.addMarker(new MarkerOptions().position(tajmahal).title("Taj Mahal").snippet("Agra, Uttar pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        LatLng bomjesus = new LatLng(15.5009, 73.9116);
        mMap.addMarker(new MarkerOptions().position(bomjesus).title("Basilica of Bom Jesus").snippet("Bainguinim, Goa")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        LatLng CHARMINAR = new LatLng(17.3616 , 78.4747);
        mMap.addMarker(new MarkerOptions().position(CHARMINAR).title("Charminar").snippet("Hyderabad, Telangana")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));


    }
}