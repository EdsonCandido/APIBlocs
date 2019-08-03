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
public final class NegocieCoins extends Exchange{

    public NegocieCoins() throws IOException {
        this.url = "https://broker.negociecoins.com.br/api/v3/btcbrl";
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
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        
        if (conn.getResponseCode() != 200) {
            System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        this.json = new JSONObject(br.readLine());
        
    }

}
