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
        this.url = "https://www.mercadobitcoin.net/api/BTC/ticker";
        getValues();
    }

    @Override
    public void getValues() throws IOException {
        super.getValues();
        this.jsonTicker = jsonTicker.getJSONObject("ticker");
    }
}
