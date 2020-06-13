/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

/**
 *
 * @author LENOVO
 */
import com.DAO.PegawaiDAO;
import com.DAOImplement.implementPegawai;
import com.model.pegawai;
import com.model.tableModelPegawai;
import com.view.FormPegawai;
import java.util.List;
import javax.swing.JOptionPane;
public class controllerPegawai {
    FormPegawai frame;
    implementPegawai
            implPegawai; List<pegawai>lb;
    public controllerPegawai(FormPegawai frame) {
        this.frame = frame;
        implPegawai = new PegawaiDAO();
        lb = implPegawai.getALL();
    }
    
    public void reset() {
        frame.getTxtId().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtEmail().setText("");
        frame.getTxtPassword().setText("");
        frame.getTxtTgl_lahir().setText("");
    }
    
    public void isiTable() {
        lb = implPegawai.getALL();
        tableModelPegawai tmb = new tableModelPegawai(lb);
        frame.getTableData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.getTxtId().setText(lb.get(row).getId().toString()); 
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtEmail().setText(lb.get(row).getEmail());
        frame.getTxtPassword().setText(lb.get(row).getPassword());
        frame.getTxtTgl_lahir().setText(lb.get(row).getTgl_lahir()); 
    }
    
    public void insert() {
        if (!frame.getTxtId().getText().trim().isEmpty()&!frame.getTxtNama().getText().trim().isEmpty()) {
            pegawai b = new pegawai(); 
            b.setId(Integer.parseInt(frame.getTxtId().getText())); 
            b.setNama(frame.getTxtNama().getText()); 
            b.setEmail(frame.getTxtEmail().getText());
            b.setPassword(frame.getTxtPassword().getText());
            b.setTgl_lahir(frame.getTxtTgl_lahir().getText());
            
            implPegawai.insert(b); 
            JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update() {
        if (!frame.getTxtId().getText().trim().isEmpty()) {
            pegawai b = new pegawai();
               
            b.setNama(frame.getTxtNama().getText());
            b.setEmail(frame.getTxtEmail().getText());
            b.setPassword(frame.getTxtPassword().getText());
            b.setTgl_lahir(frame.getTxtTgl_lahir().getText());
            b.setId(Integer.parseInt(frame.getTxtId().getText()));
            implPegawai.update(b);

            JOptionPane.showMessageDialog(null, "Update Data  sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan di ubah"); 
        }
    }
    
    public void delete() {
        if (!frame.getTxtId().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtId().getText());
            implPegawai.delete(id);
            
            JOptionPane.showMessageDialog(null, "Hapus Data  sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan di hapus");
        }
    }
    
}
