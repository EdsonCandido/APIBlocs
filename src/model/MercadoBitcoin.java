/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;

/**
 *
 * @author edson
 */
public final class MercadoBitcoin extends Exchange {

    public MercadoBitcoin() throws IOException {
        this.urlTicker = "https://www.mercadobitcoin.net/api/BTC/ticker";
        //this.urlOrderbook = "https://www.mercadobitcoin.net/api/BTC/orderbook";

        updateValues();
    }

    @Override
    public void updateValues() throws IOException {
        super.updateValues();
        this.jsonTicker = jsonTicker.getJSONObject("ticker");
    }
}
