package com.brunjoy;


public  class Setting {

    static {
        System.loadLibrary( "jni_framera" );
//        Log.d( "lib", "-----------loadLibrary-----------" );
    }
    
    
    public native boolean set(int key, int value);

    public native boolean setParam(int key);

    public native String getParam(int key);

}
