package com.brunjoy.jni;

import java.lang.reflect.Method;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.brunjoy.Setting;

public class MainActivity extends Activity {

//    private BaseAdapter mAdapter;
    String TAG = "MainActivity";
    private TextView  tvView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
//        ListView listView = (ListView) findViewById( R.id.mListview );
        tvView=(TextView) findViewById( R.id.content );
//        sets = new Setting( );
        Log.e( TAG, " new Setting( )" );

//        Class<Setting> clasz = Setting.class;
//        Method[] meds = clasz.getMethods( );
//        for (Method med : meds) {
//            Log.e( TAG, " method  getModifiers=" + med.getModifiers( ) );
//            Log.e( TAG, " method  getName=" + med.getName( ) );
//            Log.e( TAG, " method  getDefaultValue=" + med.getDefaultValue( ) );
//            Log.e( TAG, " method  getGenericReturnType=" + med.getGenericReturnType( ) );
//
//        }
        

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // getMenuInflater( ).inflate( R.menu.activity_main, menu );
        menu.add( 0, 0, 0, "menu1" );
        menu.add( 0, 1, 0, "menu2" );
        menu.add( 0, 2, 0, "menu3" );
        menu.add( 0, 3, 0, "menu4" );
        menu.add( 0, 4, 0, "menu5" );
        super.onCreateOptionsMenu( menu );
        return true;
    }

    private void showToast(String msg) {
        Toast.makeText( this, msg, Toast.LENGTH_SHORT ).show( );
    }

//    Setting sets;
    JNINet mJniNet=new JNINet( );
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId( )) {
        case 0:
            tvView.setText( mJniNet.doGet( "/items/getAllParentsCategorys" ));
//            tvView.setText( "sets.set( 2, 2 )"+sets.set( 2, 2 ) );
            break;
        case 1:
//            tvView.setText( "sets.set( 2, 2 )"+sets.set( 2, 2 ) );
//            showToast( "  sets.getParam( 12 )" + sets.setParam( 12 ) );
            break;
        case 2:
//            tvView.setText(  "  sets.getParam( 3 )" + sets.getParam( 3 ) );
         
            break;
        case 3:
//            tvView.setText( "read file /mnt/sdcard/c360_debug.txt ="+new JNI().readFile( "/mnt/sdcard/c360_debug.txt" ) );
           
            break;
        case 4:

            break;
        case 5:

            break;
        default:
            break;
        }

        return true;
    }

}
