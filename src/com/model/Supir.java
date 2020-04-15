package com.model;

public class Supir {
    private Integer id;
    private String nama;
    private String alamat;
    private String tgl_lahir;
    private String no_telp;
    private String jenis_kelamin;
    
    public Integer getid(){
        return id;
    }
    public void setid(Integer id){
        this.id=id;
    }
    public String getnama(){
        return nama;
    }
    public void setnama(String Nama){
        this.nama=Nama;
    }
    public String getalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public String gettgl_lahir(){
        return tgl_lahir;
    }
    public void settgl_lahir(String tgl_lahir){
        this.tgl_lahir=tgl_lahir;
    }    
    public String getno_telp(){
        return no_telp;
    }
    public void setno_telp(String no_telp){
        this.no_telp=no_telp;
    }   
    public String getjenis_kelamin(){
        return jenis_kelamin;
    }
    public void setjenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin=jenis_kelamin;
    }
    
}