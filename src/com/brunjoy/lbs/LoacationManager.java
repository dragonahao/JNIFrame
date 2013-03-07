package com.brunjoy.lbs;

import android.content.Context;
import android.location.GpsStatus.Listener;
import android.location.LocationManager;

public class LoacationManager {

    private LocationManager mLocationManager;

    public LoacationManager(Context mContext) {
        mLocationManager = (LocationManager) mContext.getSystemService( Context.LOCATION_SERVICE );

    }

    public void addListener() throws Exception {
        if (mLocationManager == null) {
            throw new Exception( "LocationManager is NULL" );
        }
        mLocationManager.addGpsStatusListener( new Listener( ) {

            @Override
            public void onGpsStatusChanged(int event) {
                // TODO Auto-generated method stub

            }
        } );
        
    }
}
