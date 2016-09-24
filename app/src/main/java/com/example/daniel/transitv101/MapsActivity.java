package com.example.daniel.transitv101;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        googleMap.setOnMarkerClickListener(null);

        // Create markers
        LatLng MQU = new LatLng(-33.775032, 151.113982);
        LatLng MQUStation = new LatLng(-33.776928, 151.117580);
        LatLng MQUResearchPark = new LatLng(-33.775091, 151.119383);
        LatLng MQUHospital = new LatLng(-33.773366, 151.118010);
        LatLng MQUManagementDrive = new LatLng(-33.771745, 151.116727);
        LatLng MQUCulloden = new LatLng(-33.768893, 151.111157);
        LatLng MQUVillage = new LatLng(-33.768835, 151.106241);
        LatLng MQUDayman = new LatLng(-33.772139, 151.101675);
        LatLng MQUHadenfield = new LatLng(-33.776444, 151.108482);
        LatLng MQULibrary = new LatLng(-33.773549, 151.112006);
        LatLng MQUW5Carpark = new LatLng(-33.774131, 151.109762);
        LatLng MQUHearingHub = new LatLng(-33.776934, 151.112067);

        //Create Boundary
        //MQUBounds = new LatLngBounds( new LatLng(-35.0, 138.58), new LatLng(-34.9, 138.61));

        // Move camera
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MQU,15));
        //mMap.setLatLngBoundsForCameraTarget(MQUBounds);

        // Place markers
        mMap.addMarker(new MarkerOptions().position(MQUStation).title("University Station"));
        mMap.addMarker(new MarkerOptions().position(MQUResearchPark).title("Research Park: Innovation Road"));
        mMap.addMarker(new MarkerOptions().position(MQUHospital).title("University Hospital"));
        mMap.addMarker(new MarkerOptions().position(MQUManagementDrive).title("Management Drive"));
        mMap.addMarker(new MarkerOptions().position(MQUCulloden).title("Culloden Road"));
        mMap.addMarker(new MarkerOptions().position(MQUVillage).title("University Village"));
        mMap.addMarker(new MarkerOptions().position(MQUDayman).title("Dayman Place"));
        mMap.addMarker(new MarkerOptions().position(MQUHadenfield).title("Hadenfield Avenue, Y3A"));
        mMap.addMarker(new MarkerOptions().position(MQULibrary).title("University Library"));
        mMap.addMarker(new MarkerOptions().position(MQUW5Carpark).title("West 5 carpark"));
        mMap.addMarker(new MarkerOptions().position(MQUHearingHub).title("Australian Hearing Hub"));



    }
}
