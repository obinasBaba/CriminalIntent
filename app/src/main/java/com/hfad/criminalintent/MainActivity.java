package com.hfad.criminalintent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    public static String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i( TAG, "OncREATE_ACTIV -0");
        super.onCreate( savedInstanceState );
        Toast.makeText( this, "OnCreate_ACTIV", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "OncREATE_ACTIV -1");
        setContentView( R.layout.activity_main );

        Log.i( TAG, "OncREATE_ACTIV -2");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText( this, "OnStart_ACTIV", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "OnStart_ACTIV");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText( this, "OnResume_ACTIV", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "OnResume_ACTIV");
    }

    @Override
    protected void onStop() {
        super.onStop();
         Log.i( TAG, "OnStop_ACTIV");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( TAG, "OnDestroy_ACTIV");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( TAG, "OnPause_ACTIV");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i( TAG, "OnRestart_ACTIV");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.i( TAG, "OnCreateOptionMenu_....");
        return super.onCreateOptionsMenu( menu );

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.i( TAG, "OnOptionItemSelected...");
        return super.onOptionsItemSelected( item );
    }
}
