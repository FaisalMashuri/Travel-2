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
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class tableModelPegawai extends AbstractTableModel {
    List<pegawai>lb;
    
    public tableModelPegawai(List<pegawai>lb) {
        this.lb = lb;
    }

    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Email";
            case 3:
                return "Password";
            case 4:
                return "Tanggal Lahir";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:
                return lb.get(row).getId();
            case 1:
                return lb.get(row).getNama();
            case 2:
                return lb.get(row).getEmail();
            case 3:
                return lb.get(row).getPassword();
            case 4:
                return lb.get(row).getTgl_lahir();
            default:
                return null;
        }
    }
}
