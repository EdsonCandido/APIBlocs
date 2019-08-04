/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;

/**
 *
 * @author Gabriel
 */
public final class BitcoinTrade extends Exchange {

    public BitcoinTrade() throws IOException {
        this.url = "https://api.bitcointrade.com.br/v2/public/BRLBTC/ticker";
        getValues();
    }

    @Override
    public void getValues() throws IOException {
        super.getValues();
        this.jsonTicker = jsonTicker.getJSONObject("data");
    }
    
    @Override
    public float getVol(){
        return this.jsonTicker.getFloat("volume");
    }
    
}
