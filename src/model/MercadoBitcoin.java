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
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author edson
 */
public class MercadoBitcoin {

    private final String url = "https://www.mercadobitcoin.net/api/";

    public JSONObject getValues(String moeda) throws IOException {
        String webservice = this.url + moeda.toUpperCase() + "/ticker";

        URL web = new URL(webservice);
        HttpURLConnection conn = (HttpURLConnection) web.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ACCEPT", "application/jason");

        System.out.println(webservice);
        if (conn.getResponseCode() != 200) {
            return null;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String saida = br.readLine();
        JSONObject json = new JSONObject(saida);
        JSONObject ticker = json.getJSONObject("ticker");

        return ticker;
    }

    public Double getSell() throws IOException {
        
        return getValues("btc").getDouble("sell");
    }
}
