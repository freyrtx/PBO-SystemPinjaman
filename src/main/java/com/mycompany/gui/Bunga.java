/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

/**
 *
 * @author fahmi
 */
public class Bunga {
    int awal,jangka,masa,pokok;
    double total,angs,bunga;
        
    //getter
    public int getAjuan(){
        return awal;
    }
    
    public int getJangka(){
        return jangka;
    }
        
    public int getMasa(){
        return masa;
    }
    
    public int getPokok(){
        return pokok;
    }

    public double getAngs(){
        return angs;
    }
    
    public double getbunga(){
        return bunga;
    }
        
    //setter
    public void setAjuan(int awal){
        this.awal = awal;
    }
        
    public void setJangka(int jangka){
        this.jangka = jangka;
    }
        
    public void setMasa(int masa){
        this.masa = masa;
    }
    
    public void setPokok(int pokok){
        this.pokok = pokok;
    }
    
    public void setAngs(double angs){
        this.angs = angs;
    }
    
    public void setBunga(double bunga){
        this.bunga = bunga;
    }
}
