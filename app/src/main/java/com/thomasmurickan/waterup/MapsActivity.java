package com.thomasmurickan.waterup;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements LocationListener {

    LocationManager locationManager;
    String context = Context.LOCATION_SERVICE;
    String provider;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
        Intent i = getIntent();

        final LatLng FS1 = new LatLng(43.019582, -83.685547);
        Marker fs1 = mMap.addMarker(new MarkerOptions()
                .position(FS1)
                .title("Fire Station #1"));
        fs1.showInfoWindow();


        final LatLng FS3 = new LatLng(43.016838, -83.691473);
        Marker fs3 = mMap.addMarker(new MarkerOptions()
                .position(FS3)
                .title("Fire Station #3"));
        fs3.showInfoWindow();

        final LatLng FS5 = new LatLng(43.013805, -83.692444);
        Marker fs5 = mMap.addMarker(new MarkerOptions()
                .position(FS5)
                .title("Fire Station #5"));
        fs5.showInfoWindow();

        final LatLng FS6 = new LatLng(43.013805, -83.692444);
        Marker fs6 = mMap.addMarker(new MarkerOptions()
                .position(FS6)
                .title("Fire Station #6"));
        fs6.showInfoWindow();

        final LatLng FS8 = new LatLng(43.013805, -83.692444);
        Marker fs8 = mMap.addMarker(new MarkerOptions()
                .position(FS8)
                .title("Fire Station #8"));
        fs8.showInfoWindow();





    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */


    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.013805, -83.692444), 14));

    }

    /*
    private double[][] arrayLatLng = new double[][] { { 43.017448, -83.690147 }, { 43.019582, -83.685547 }, { 43.016838, -83.691473 }, { 43.013805, -83.692444 }};
    private String[] locationName = new String[] { "Durant, UM Flint", "Cafe", "MSU", "Saginaw"};

    private void setUpMap() {
        for (int i = 0; i < arrayLatLng.length; i++) {
            final LatLng latLng = new LatLng(arrayLatLng[i][0], arrayLatLng[i][1]);
            mMap.addMarker(new MarkerOptions().position(latLng).title(locationName[i]).snippet("Last Updated: \n Hours: \n Exception: "));
        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(arrayLatLng[0][0], arrayLatLng[0][1]), 14));


            //for adding titles, would I have to do a multidimensional array, or maybe add a separate array?
        }
        */


    @Override
    public void onLocationChanged (Location location){


    }

    @Override
    public void onStatusChanged (String provider,int status, Bundle extras){


    }

    @Override
    public void onProviderEnabled (String provider){


    }

    @Override
    public void onProviderDisabled (String provider){


    }
}
