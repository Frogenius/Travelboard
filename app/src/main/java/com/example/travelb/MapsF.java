package com.example.travelb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsF extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap mMap;

    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Button buttonK = (Button) findViewById(R.id.profil);
        buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(MapsF.this, HomeActivity.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });


        Button buttonPogoda = (Button) findViewById(R.id.pogoda);

        buttonPogoda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(MapsF.this, Pogoda.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        Button buttonSearch = (Button) findViewById(R.id.search);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(MapsF.this, Search.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });
        Button buttonKal = (Button) findViewById(R.id.kalendar);

        buttonKal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(MapsF.this, Kalendar.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


       @Override
        public void onMapReady(GoogleMap googleMap) {
           mMap = googleMap;

            LatLng sydney = new LatLng(48.85852889079457, 2.294470576297195);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Eiffel Tower").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

           LatLng Building = new LatLng(48.859270070618805, 2.300886468828968);
           mMap.addMarker(new MarkerOptions().position(Building).title("Lavirotte Building").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(Building));

           LatLng Hotel = new LatLng(48.85761472474312, 2.3126990704321533);
           mMap.addMarker(new MarkerOptions().position(Hotel).title("Hotel des Invalides").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(Hotel));

           LatLng Pantheon = new LatLng(48.84693793554241, 2.3467766201128524);
           mMap.addMarker(new MarkerOptions().position(Pantheon).title("Panthéon").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(Pantheon));

           LatLng Centre = new LatLng(48.865734736044956, 2.3518985314874152);
           mMap.addMarker(new MarkerOptions().position(Centre).title("Le Centre Pompidou").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(Centre));

           LatLng Place = new LatLng(48.850485150047966, 2.39552385894095);
           mMap.addMarker(new MarkerOptions().position(Place).title("Place de la Nation").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(Place));
        }




    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_maps, container, false);
    }

    }
   /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);

    }
}*/