/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;


import com.DAO.DAOTravel;
import com.model.Travel;
import com.model.TableModelTravel;
import com.view.MenuTravelPegawai;
import java.util.List;
import javax.swing.JOptionPane;
import com.DAOImplement.ImplementTravel;
import com.view.MenuRiwayatPegawai;

/**
 *
 * @author FAISAL
 */
public class ControllerTravel {
    MenuTravelPegawai frame;
    MenuRiwayatPegawai tmp;
    ImplementTravel implTravel; 
    List<Travel> lb;
    
    public ControllerTravel(MenuTravelPegawai frame, MenuRiwayatPegawai tmp) {
        this.frame = frame;
        this.tmp = tmp;
        implTravel= new DAOTravel();
        lb = implTravel.getALL();
    }
    
    public void reset() { 
        frame.getNama().setText(""); 
        frame.getHarga().setText(""); 
    
    }
    
    public void isiTable() {
    lb = implTravel.getALL();
    TableModelTravel tmb = new TableModelTravel(lb);
    tmp.getTabelData().setModel(tmb);
}
//merupakan fungsi untuk menampilkan data yang dipilih dari tabel 
//    public void isiField(int row) {
//        tmp.getTextID().setText(lb.get(row).getId().toString()); 
//        tmp.getTxtNopol().setText(lb.get(row).getNopol()); 
//        tmp.getTxtTujuan().setSelectedItem(lb.get(row).getTujuan()); 
//
//    }
//merupakan fungsi untuk insert data berdasarkan inputan user dari textfield di frame
    public void insert() {
        if (frame.getTujuan().getSelectedItem() !=null) {
            Travel b = new Travel(); 
            b.setJam(frame.getJam().getSelectedItem().toString()); 
//            Object selectedItem=frame.getTujuan().getSelectedItem();
//            String str=selectedItem.toString();
            b.setTujuan_id(frame.getTujuan().getSelectedItem().toString());
            b.setNama_pemesan(frame.getNama().getText());
            b.setTgl_keberangkatan(frame.getTgl_berangkat().getText());
            b.setHarga(frame.getHarga().getText());
            b.setNo_kursi(Integer.parseInt(frame.getNo_kursi().getSelectedItem().toString()));
            
            
            
            
            implTravel.insert(b); 
            JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
//berfungsi untuk update data berdasarkan inputan user dari textfield di frame 
    public void update() {
        if (!tmp.getTextID().getText().trim().isEmpty()) {
            Travel b = new Travel(); 
            b.setStatus_pembayaran(tmp.getLunas());
            b.setId(Integer.parseInt(tmp.getTextID().getText()));
            implTravel.update(b);
            JOptionPane.showMessageDialog(null, "Update Data sukses");
        } else {
            JOptionPane.showMessageDialog(tmp, "Pilih data yang akan di ubah");
        }
    }
//berfungsi menghapus data yang dipilih
    public void delete() {
        if (!tmp.getTextID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(tmp.getTextID().getText());
            implTravel.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data sukses");
        } else {
            JOptionPane.showMessageDialog(tmp, "Pilih data yang akan di hapus");
        }
    }
}


