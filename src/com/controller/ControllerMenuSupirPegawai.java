/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.DAO.SupirDAO;
import com.DAOImplement.implementSupir;
import com.model.Supir;
import com.model.tableModelSupir;
import com.view.MenuSupirPegawai;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author FAISAL
 */
public class ControllerMenuSupirPegawai {
    MenuSupirPegawai frame;
    implementSupir implSupir; 
    List<Supir> lb;
    
    public ControllerMenuSupirPegawai(MenuSupirPegawai frame) {
        this.frame = frame;
        implSupir = new SupirDAO();
        lb = implSupir.getALL();
    }
    
    public void isiTable() {
        lb = implSupir.getALL();
        tableModelSupir tmb = new tableModelSupir(lb);
        frame.getTabelData().setModel(tmb);
    }
    
//    public void isiField(int row) {
//        frame.getTxtid().setText(lb.get(row).getid().toString());
//        frame.getTxtnama().setText(lb.get(row).getnama()); 
//        frame.getTxtalamat().setText(lb.get(row).getalamat()); 
//        frame.getTxttgl_lahir().setText(lb.get(row).gettgl_lahir());
//        frame.getTxtno_telp().setText(lb.get(row).getno_telp());
//        frame.getTxtjenis_kelamin().setText(lb.get(row).getjenis_kelamin());
//    }
    
    
}
