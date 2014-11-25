package com.hackasoton.myogesturetospeech;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class Voice
{
    private static TextToSpeech textToSpeech;
    private static Context context;

    public static void setContext(Context applicationContext)
    {
        context = applicationContext;

        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener()
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

    public static void speak(String message)
    {
        MessageBox.show(context, message);

        // This method was deprecated in API level 21, but our minimum is 18.
        textToSpeech.speak(message, TextToSpeech.QUEUE_FLUSH, null);
    }

    public static void stop()
    {
        if (textToSpeech != null)
        {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
