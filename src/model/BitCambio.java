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
public final class BitCambio extends Exchange {

    public BitCambio() throws IOException {
        this.url = "https://bitcambio_api.blinktrade.com/api/v1/BRL/ticker";
        getValues();
    }

}
