/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.DAO.daoTujuan;

import com.DAOImplement.ImplementTujuan;

import com.model.tujuan;

import com.model.tableModelTujuan;

import com.view.FormTujuan;

import java.util.List;

import javax.swing.JOptionPane;
/**
 *
 * @author Raisya Rahma
 */
public class ControllerTujuan {
    
    FormTujuan frame;
    ImplementTujuan
    implTujuan; List<tujuan>
    lb;
    
    public ControllerTujuan(FormTujuan frame){
        this.frame = frame;
        
        implTujuan = new daoTujuan();
        
        lb = implTujuan.getALL();
        
    }
    
    
    public void
    reset(){
        
        frame.getTxtID().setText("");
        frame.getTxtTujuan().setText("");
        frame.getTxtHarga().setText("");
                
            }
    
     public void isiTable(){
        
        lb = implTujuan.getALL();
        
        tableModelTujuan tmb = new tableModelTujuan(lb);
        
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        
        frame.getTxtID().setText(String.valueOf(lb.get(row).getId()));
        frame.getTxtTujuan().setText(lb.get(row).getTujuan());
        frame.getTxtHarga().setText(String.valueOf(lb.get(row).getHarga()));
        
        
    }
    
    public void insert(){
        
        if(!frame.getTxtTujuan().getText().trim().isEmpty()&
        !frame.getTxtHarga().getText().trim().isEmpty()){
            
            tujuan b = new tujuan();
            b.setTujuan(frame.getTxtTujuan().getText());
            b.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            b.setJam(String.valueOf(frame.getTxtJam().getSelectedItem()));
            
            
            implTujuan.insert(b);
            JOptionPane.showMessageDialog(null,"Simpan Data sukses");
            
        }else{
            
            JOptionPane.showMessageDialog(frame,"Data Tidak Boleh Kosong");
            
        }
        
        }
    
    public void update(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            
            tujuan b = new tujuan();
            b.setTujuan(frame.getTxtTujuan().getText());
            b.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            b.setJam(String.valueOf(frame.getTxtJam().getSelectedItem()));
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implTujuan.update(b);
        }else{
            JOptionPane.showMessageDialog(frame,"pilih data yang akan diubah");
        }
            
            
            
            
        
        
        }
    
    public void delete(){
        if(!frame.getTxtID().getText().trim().isEmpty()){
            
            int id = Integer.parseInt(frame.getTxtID().getText());
            
            implTujuan.delete(id);
            
            JOptionPane.showMessageDialog(null,"Hapus Data Sukses");
            
        }else{
            
            JOptionPane.showMessageDialog(frame,"pilih data yang akan di hapus");
            
        }
        
        }
    
        }