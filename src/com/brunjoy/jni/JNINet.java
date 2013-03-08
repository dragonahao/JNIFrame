package com.brunjoy.jni;

public class JNINet {
    static {
        try {
            System.loadLibrary( "jni_framera" );
        } catch (Exception ex) {
            System.out.println( ex );
        }
    }

    private native boolean setHost(String host);

    private native boolean setPort(int port);

    public native String doGet(String path);

    private native String doPost(String path);
}
