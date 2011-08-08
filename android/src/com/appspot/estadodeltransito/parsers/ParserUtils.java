package com.appspot.estadodeltransito.parsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ParserUtils {

    public static String getUrlContent(String url) throws MalformedURLException,
    UnsupportedEncodingException, IOException {

        StringBuffer buffer = new StringBuffer();

        URL pageUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) pageUrl
                .openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                connection.getInputStream(), "UTF-8"));

        String inputLine;

        while ((inputLine = in.readLine()) != null)
            buffer.append(inputLine);

        in.close();
        return buffer.toString();
    }
}