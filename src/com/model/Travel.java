/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author FAISAL
 */
public class Travel {
    private int id;
    private String nama_pemesan;
    private String tujuan_id;
    private String tgl_keberangkatan;
    private String status_pembayaran;
    private String harga;
    private int no_kursi;
    private String jam;
    private String mobil_id;

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMobil_id() {
        return mobil_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    public String getTujuan_id() {
        return tujuan_id;
    }

    public void setTujuan_id(String tujuan_id) {
        this.tujuan_id = tujuan_id;
    }

    public String getTgl_keberangkatan() {
        return tgl_keberangkatan;
    }

    public void setTgl_keberangkatan(String tgl_keberangkatan) {
        this.tgl_keberangkatan = tgl_keberangkatan;
    }

    public String getStatus_pembayaran() {
        return status_pembayaran;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }

    public String getHarga() {
        return harga;
    }

    public void setMobil_id(String harga) {
        this.harga = harga;
    }

    public int getNo_kursi() {
        return no_kursi;
    }

    public void setNo_kursi(int no_kursi) {
        this.no_kursi = no_kursi;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    
}
