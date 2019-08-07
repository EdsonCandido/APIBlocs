/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;

/**
 *
 * @author Gabriel
 */
public abstract class Exchange {

    protected String url;
    protected JSONObject jsonTicker;

    public void getValues() throws IOException {

        URL web = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) web.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ACCEPT", "application/json");
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");

        //Corrige exception "CertificateException" causado em algumas versões de JDK
        HttpsURLConnection.setDefaultHostnameVerifier((String hostname, SSLSession session) -> true);

        if (conn.getResponseCode() != 200) {
            System.err.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        this.jsonTicker = new JSONObject(br.readLine());

    }

    public long getDate() {
        return this.jsonTicker.getLong("date");
    }

    public float getSell() {
        return this.jsonTicker.getFloat("sell");
    }

    public float getBuy() {
        return this.jsonTicker.getFloat("buy");
    }

    public float getLast() {
        return this.jsonTicker.getFloat("last");
    }

    public float getHigh() {
        return this.jsonTicker.getFloat("high");
    }

    public float getLow() {
        return this.jsonTicker.getFloat("low");
    }

    public float getVol() {
        return this.jsonTicker.getFloat("vol");
    }

}
