package com.hackasoton.myogesturetospeech;



import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.thalmic.myo.Hub;

import java.util.ArrayList;

public class MainActivity extends Activity
{
    private String TAG = "MainActivity";
    TTS tts;
    private ArrayList<String> phraseList = new ArrayList<String>();

    private ArrayList<Integer> = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TTS(getApplicationContext());
        Hub hub = Hub.getInstance();
        if (!hub.init(this)) {
            Log.e(TAG, "Could not initialize the Hub.");
            finish();
            return;
        }

        phraseList.add("Hi");
        phraseList.add(300);
        phraseList.add("we are Eloqui");
        p

    }

    @Override
    public void onPause()
    {
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
        tts.speakText(getApplicationContext());
        for(String phrase : phraseList)
    }


}