package com.techcruz.arappformonuments;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class forthmaps extends FragmentActivity implements OnMapReadyCallback{
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forthmaps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        {
            LatLng brihadeshwaratemple = new LatLng(10.7828, 79.1318);
            mMap.addMarker(new MarkerOptions().position(brihadeshwaratemple).title("Brihadeshwara temple"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(brihadeshwaratemple));
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
            LatLng greatstupa = new LatLng(23.479223,77.739683);
            mMap.addMarker(new MarkerOptions().position(greatstupa).title("The Great Stupa")
                    .snippet("Sanchi,madhya pradesh")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
            LatLng elloracave = new LatLng( 20.0258, 75.1780);
            mMap.addMarker(new MarkerOptions().position(elloracave).title("Ellora Caves")
                    .snippet("Ellora, Maharastra")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
            LatLng bomjesus = new LatLng(15.5009, 73.9116);
            mMap.addMarker(new MarkerOptions().position(bomjesus).title("Basilica of Bom Jesus").snippet("Bainguinim, Goa")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
            LatLng CHARMINAR = new LatLng(17.3616 , 78.4747);
            mMap.addMarker(new MarkerOptions().position(CHARMINAR).title("Charminar").snippet("Hyderabad, Telangana")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));


            LatLng ramtemple = new LatLng(26.7956, 82.1943);
            mMap.addMarker(new MarkerOptions().position(ramtemple).title("Ram mandir").snippet("Ayodhya,Uttar Pradesh")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            LatLng buddha = new LatLng(24.690472, 84.981806);
            mMap.addMarker(new MarkerOptions().position(buddha).title("The Great Buddha").snippet("Bodh Gaya,Bihar")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

            LatLng statueofunity = new LatLng( 21.8380, 73.7191);
            mMap.addMarker(new MarkerOptions().position(statueofunity).title("Statue of unity").snippet("Kevadia,Gujarat")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            LatLng adiyogishiva = new LatLng(10.972416, 76.740602);
            mMap.addMarker(new MarkerOptions().position(adiyogishiva).title("Adiyogi shiva").snippet("Coimbatore,Tamil Nadu")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

            LatLng ataltunnel = new LatLng(32.40127, 77.148335);
            mMap.addMarker(new MarkerOptions().position(ataltunnel).title("Atal tunnel").snippet("Rohtang pass ,Himachal Pradesh")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ataltunnel));
            LatLng ashokpillar = new LatLng(28.673862, 77.211839);
            mMap.addMarker(new MarkerOptions().position(ashokpillar).title("Ashoka Pillar").snippet("Ashoka Pillar, Delhi - NCR")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ashokpillar));
            LatLng qutubminar = new LatLng(  28.5245 , 77.1855);
            mMap.addMarker(new MarkerOptions().position(qutubminar).title("Qutub Minar")
                    .snippet(" New Delhi, Delhi")
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));



        }
    }
}