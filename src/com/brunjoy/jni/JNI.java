package com.brunjoy.jni;

public class JNI {
    static {
        System.loadLibrary( "jni_framera" );
    }
    // private static native String a(byte[] paramArrayOfByte, int paramInt);
    public static native String readFile(String fileName);
    // private static native String b(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
}
