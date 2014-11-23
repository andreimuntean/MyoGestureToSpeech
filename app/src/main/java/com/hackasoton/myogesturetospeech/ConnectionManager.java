package com.hackasoton.myogesturetospeech;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionManager
{
    public static String fetchMessage(URL url)
    {
        String message = "";

        try
        {
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int data = inputStreamReader.read();

            while (data != -1)
            {
                message += (char)data;
                data = inputStreamReader.read();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return message;
    }
}
