/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Raisya Rahma
 */
public class tujuan {
    private int id;
    private String tujuan;
    private int harga;
    private String jam;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan=tujuan;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga( int harga){
        this.harga=harga;
    }
    
    public String getJam(){
        return jam;
    }
    
    public void setJam(String jam){
        this.jam=jam;

    }
}