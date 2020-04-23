/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

/**
 *
 * @author Fianti Savitri
 */
import com.DAO.DAOMobil;
import com.DAOImplement.ImplementMobil;
import com.model.mobil;
import com.model.TableModelMobil;
import com.view.MobilTampil;
import java.util.List;
import javax.swing.JOptionPane;
import com.DAOImplement.ImplementMobil;

public class ControllerMobil {
    MobilTampil frame; 
    ImplementMobil implMobil; 
    List<mobil> lb;
    
public ControllerMobil(MobilTampil frame) {
    this.frame = frame;
    implMobil = new DAOMobil();
    lb = implMobil.getALL();
}
//mengosongkan field public void reset() {
public void reset() {
    frame.getTxtID().setText(""); 
    frame.getTxtNopol().setText(""); 
    frame.getTxtTujuan().setSelectedItem(""); 
    
}
//menampilkan data ke dalam tabel 
public void isiTable() {
    lb = implMobil.getALL();
    TableModelMobil tmb = new TableModelMobil(lb);
    frame.getTabelData().setModel(tmb);
}
//merupakan fungsi untuk menampilkan data yang dipilih dari tabel 
public void isiField(int row) {
    frame.getTxtID().setText(lb.get(row).getId().toString()); 
    frame.getTxtNopol().setText(lb.get(row).getNopol()); 
    frame.getTxtTujuan().setSelectedItem(lb.get(row).getTujuan()); 
   
}
//merupakan fungsi untuk insert data berdasarkan inputan user dari textfield di frame
public void insert() {
    if (!frame.getTxtNopol().getText().trim().isEmpty()&
    frame.getTxtTujuan().getSelectedItem() !=null) {
    mobil b = new mobil(); 
    b.setId(Integer.parseInt(frame.getTxtID().getText()));
    b.setNopol(frame.getTxtNopol().getText()); 
    Object selectedItem=frame.getTxtTujuan().getSelectedItem();
    String str=selectedItem.toString();
    b.setTujuan(frame.getTxtTujuan().getSelectedItem().toString());
    implMobil.insert(b); 
    JOptionPane.showMessageDialog(null, "Simpan Data sukses");
    } else {
        JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
    }
}
//berfungsi untuk update data berdasarkan inputan user dari textfield di frame 
public void update() {
    if (!frame.getTxtID().getText().trim().isEmpty()) {
    mobil b = new mobil(); 
    b.setNopol(frame.getTxtNopol().getText());
    b.setTujuan(frame.getTxtTujuan().getSelectedItem().toString()); 
    b.setId(Integer.parseInt(frame.getTxtID().getText())); 
    implMobil.update(b);
    JOptionPane.showMessageDialog(null, "Update Data sukses");
} else {
        JOptionPane.showMessageDialog(frame, "Pilih data yang akan di ubah");
}
}
//berfungsi menghapus data yang dipilih
public void delete() {
    if (!frame.getTxtID().getText().trim().isEmpty()) {
    int id = Integer.parseInt(frame.getTxtID().getText());
    implMobil.delete(id);
    JOptionPane.showMessageDialog(null, "Hapus Data sukses");
} else {
    JOptionPane.showMessageDialog(frame, "Pilih data yang akan di hapus");
}
}


}



