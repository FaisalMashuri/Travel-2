/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Fianti Savitri
 */
public class mobil {
    private Integer id; 
    private String no_polisi; 
    private String tujuan_id;
    
        public Integer getId() {
        return id;
    }
        public void setId(Integer id) {
        this.id = id;
    }
        public String getNopol() {
        return no_polisi;
    }
        public void setNopol(String no_polisi) {
        this.no_polisi = no_polisi;
    }
        public String getTujuan(){
        return tujuan_id;

    }
        public void setTujuan(String tujuan_id){
            this.tujuan_id=tujuan_id;
        }
}
