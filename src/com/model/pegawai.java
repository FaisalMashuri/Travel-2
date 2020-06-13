/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author LENOVO
 */
public class pegawai {
    private Integer id;
    private String nama;
    private String email;
    private String password;
    private String tgl_lahir;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getTgl_lahir() {
        return tgl_lahir;
    }
    public void setTgl_lahir(String tgl_lahir){
        this.tgl_lahir = tgl_lahir;
    }
}
