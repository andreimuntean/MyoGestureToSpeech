package com.hackasoton.myogesturetospeech;

import android.content.Context;
import android.widget.Toast;

public class MessageBox
{
    public static void show(Context applicationContext, CharSequence message)
    {
        Toast.makeText(applicationContext, "Hello World!", Toast.LENGTH_SHORT).show();
    }
}