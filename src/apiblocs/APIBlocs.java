/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiblocs;

import java.io.IOException;
import model.*;

/**
 *
 * @author edson
 */
public class APIBlocs {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Exchange mb = new MercadoBitcoin();
        System.out.println("Mercado Bitcoin:");
        System.out.println("High: " + mb.getHigh());
        System.out.println("Low: " + mb.getLow());
        System.out.println("Date: " + mb.getDate());
        System.out.println("Sell: " + mb.getSell());
        System.out.println("Buy: " + mb.getBuy());
        System.out.println("Last: " + mb.getLast());
        System.out.println("Vol: " + mb.getVol());
        

        System.out.println();

        Exchange nc = new NegocieCoins();
        System.out.println("Negocie Coins:");
        System.out.println("High: " + nc.getHigh());
        System.out.println("Low: " + nc.getLow());
        System.out.println("Date: " + nc.getDate());
        System.out.println("Sell: " + nc.getSell());
        System.out.println("Buy: " + nc.getBuy());
        System.out.println("Last: " + nc.getLast());
        System.out.println("Vol: " + nc.getVol());
    }
}
