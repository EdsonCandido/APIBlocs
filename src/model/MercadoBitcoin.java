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
import org.json.JSONObject;

/**
 *
 * @author edson
 */
public class MercadoBitcoin {

    private final String url = "https://www.mercadobitcoin.net/api/";
    private JSONObject json;
    private String moeda = "btc";

    public MercadoBitcoin() throws IOException {
        getValues();
    }

    public JSONObject getValues() throws IOException {

        StringBuilder webservice = new StringBuilder();

        webservice.append(this.url);
        webservice.append(this.moeda.toUpperCase());
        webservice.append("/ticker");

        URL web = new URL(webservice.toString());
        HttpURLConnection conn = (HttpURLConnection) web.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ACCEPT", "application/jason");

        if (conn.getResponseCode() != 200) {
            System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        JSONObject ticker = new JSONObject(br.readLine());
        this.json = ticker.getJSONObject("ticker");

        return this.json;
    }

    public Double getSell() throws IOException {
        return this.json.getDouble("sell");
    }

    public Double getBuy() throws IOException {
        return this.json.getDouble("buy");
    }
}
