package com.hackasoton.myogesturetospeech;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity
{
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSpeech = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener()
                {
                    @Override
                    public void onInit(int status)
                    {
                        if (status != TextToSpeech.ERROR)
                        {
                            textToSpeech.setLanguage(Locale.UK);
                        }
                    }
                });
    }

    @Override
    public void onPause()
    {
        if (textToSpeech != null)
        {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }

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
        MessageBox.show(getApplicationContext(), "Hello World!");

        // This method was deprecated in API level 21, but our minimum is 18.
        textToSpeech.speak(getResources().getString(R.string.hello_world),
                TextToSpeech.QUEUE_FLUSH, null);
    }
}