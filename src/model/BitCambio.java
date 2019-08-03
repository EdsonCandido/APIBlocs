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
 * @author Gabriel
 */
public final class BitCambio extends Exchange {

    public BitCambio() throws IOException {
        this.url = "https://bitcambio_api.blinktrade.com/api/v1/BRL";
        getValues();
    }
    
    @Override
    public void getValues() throws IOException {

        StringBuilder webservice = new StringBuilder();

        webservice.append(this.url);
        webservice.append("/ticker");

        URL web = new URL(webservice.toString());
        HttpURLConnection conn = (HttpURLConnection) web.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ACCEPT", "application/jason");

        if (conn.getResponseCode() != 200) {
            System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        this.json = new JSONObject(br.readLine());

    }

}
