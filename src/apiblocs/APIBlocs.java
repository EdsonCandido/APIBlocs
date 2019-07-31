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
import model.MercadoBitcoin;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MercadoBitcoin mb = new MercadoBitcoin();
        
        System.out.println( mb.getSell());
        System.out.println( mb.getBuy());
    }
}
