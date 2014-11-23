package com.hackasoton.myogesturetospeech;

import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.thalmic.myo.Hub;

public class MainActivity extends Activity
{
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (!Hub.getInstance().init(this))
        {
            Log.e(TAG, "Could not initialize the hub.");
            finish();

            return;
        }*/
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Voice.setContext(getApplicationContext());
    }

    @Override
    public void onPause()
    {
        Voice.stop();
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflates the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void speakText(View view)
    {
        Voice.speak("Hello World!");
    }


}