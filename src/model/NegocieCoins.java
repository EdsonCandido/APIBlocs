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
public final class NegocieCoins extends Exchange{

    public NegocieCoins() throws IOException {
        this.url = "https://broker.negociecoins.com.br/api/v3/btcbrl/ticker";
        getValues();
    }
}
