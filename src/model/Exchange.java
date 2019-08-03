/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author Gabriel
 */
public abstract class Exchange {
    protected String url;
    protected JSONObject json;
    
    public abstract void getValues() throws IOException;
    
    public long getDate(){
        return this.json.getLong("date");
    }
    
    public float getSell(){
        return this.json.getFloat("sell");
    }

    public float getBuy(){
        return this.json.getFloat("buy");
    }
       
    public float getLast(){
        return this.json.getFloat("last");
    }

    public float getHigh(){
        return this.json.getFloat("high");
    }
    
    public float getLow(){
        return this.json.getFloat("low");
    }

    public float getVol(){
        return this.json.getFloat("vol");
    }
    
}
