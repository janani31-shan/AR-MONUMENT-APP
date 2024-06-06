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
import com.techcruz.arappformonuments.databinding.ActivityForthmemorialBinding;

public class forthmemorial extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityForthmemorialBinding binding;
    Button fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityForthmemorialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        fr=findViewById(R.id.fir1);
        fr.setOnClickListener(view -> {
            Intent intent = new Intent(forthmemorial.this, five_memorial.class);
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

        LatLng tajmahal= new LatLng( 27.1751, 78.0421);
        mMap.addMarker(new MarkerOptions().position(tajmahal).title("Taj Mahal").snippet("Agra, Uttar pradesh")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng mysorepalace = new LatLng(12.3052 , 76.6552 );
        mMap.addMarker(new MarkerOptions().position(mysorepalace).title("Mysore Palace").snippet(" Mysore, Karnataka")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng indiagate = new LatLng( 28.6129 , 77.2295);
        mMap.addMarker(new MarkerOptions().position(indiagate).title("India Gate").snippet(" New Delhi, Delhi")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng lotustemple = new LatLng(28.5535, 77.2588);
        mMap.addMarker(new MarkerOptions().position(lotustemple).title("Lotus temple").snippet("New Delhi,Delhi")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lotustemple));
    }
}