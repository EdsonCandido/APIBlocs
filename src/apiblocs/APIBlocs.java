/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiblocs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author edson
 */
public class APIBlocs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //String webService = "https://viacep.com.br/ws/01001000/json/";
            String webService = "https://www.mercadobitcoin.net/api/BTC/ticker/";
            URL url = new URL(webService);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("ACCEPT", "application/jason");

            if (conn.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                String saida = br.readLine();
                JSONObject json = new JSONObject(saida);
                JSONObject ticker = json.getJSONObject("ticker");
                System.out.println(ticker.getDouble("low"));
                
                   
            }
        }
    catch (IOException e

    
        ) {
            System.out.println(e);
    }
}

}
