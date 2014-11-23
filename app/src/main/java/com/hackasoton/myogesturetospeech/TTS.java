package com.hackasoton.myogesturetospeech;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.View;

import java.util.Locale;

/**
 * Created by Alex on 22.11.2014.
 */
public class TTS{
    private TextToSpeech textToSpeech;

    public TTS(Context context){
        textToSpeech = new TextToSpeech(context,
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

    public void speakText(Context context)
    {
        MessageBox.show(context, "Hello World!");

        textToSpeech.speak("Hello World",
                TextToSpeech.QUEUE_FLUSH, null);
    }

    private void stop(){
        if (textToSpeech != null)
        {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
