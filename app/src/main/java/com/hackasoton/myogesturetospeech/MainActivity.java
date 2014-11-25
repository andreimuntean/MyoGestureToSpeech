package com.hackasoton.myogesturetospeech;

import android.app.Activity;
import android.os.Bundle;

import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends Activity
{

    private String TAG = "MainActivity";
    TTS tts;
    private ArrayList<String> phraseList = new ArrayList<String>();

    private ArrayList<Integer> = new ArrayList<Integer>();


=======
>>>>>>> e8931ebefbb829bdd2308a794f0ea65c012c9eaa
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
<<<<<<< HEAD
        }

        phraseList.add("Hi");
        phraseList.add(300);
        phraseList.add("we are Eloqui");
        p

=======
        }*/
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Voice.setContext(getApplicationContext());
>>>>>>> e8931ebefbb829bdd2308a794f0ea65c012c9eaa
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

<<<<<<< HEAD
    public void speakText(View view)
    {
        tts.speakText(getApplicationContext());
        for(String phrase : phraseList)
=======
        return true;
>>>>>>> e8931ebefbb829bdd2308a794f0ea65c012c9eaa
    }
}