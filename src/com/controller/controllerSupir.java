package com.controller;

import com.DAO.SupirDAO;
import com.DAOImplement.implementSupir;
import com.model.Supir;
import com.model.tableModelSupir;
import com.view.FormSupir;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class controllerSupir{
    FormSupir frame;
    implementSupir implSupir; 
    List<Supir> lb;
    public controllerSupir(FormSupir frame) {
    this.frame = frame;
    implSupir = new SupirDAO();
    lb = implSupir.getALL();
}
    public void reset(){
        
        frame.getTxtnama().setText(""); 
        frame.getTxtalamat().setText(""); 
        frame.getTxttgl_lahir().setText("");  
        frame.getTxtno_telp().setText("");
        frame.getTxtjenis_kelamin().setText("");
        
    }
    public void isiTable() {
        lb = implSupir.getALL();
        tableModelSupir tmb = new tableModelSupir(lb);
        frame.getTabelData().setModel(tmb);
        }
    
    public void isiField(int row) {
        frame.getTxtid().setText(lb.get(row).getid().toString());
        frame.getTxtnama().setText(lb.get(row).getnama()); 
        frame.getTxtalamat().setText(lb.get(row).getalamat()); 
        frame.getTxttgl_lahir().setText(lb.get(row).gettgl_lahir());
        frame.getTxtno_telp().setText(lb.get(row).getno_telp());
        frame.getTxtjenis_kelamin().setText(lb.get(row).getjenis_kelamin());
    }
    public void insert() {
        try{
            Supir b = new Supir(); 
             
            b.setnama(frame.getTxtnama().getText()); 
            b.setalamat(frame.getTxtalamat().getText()); 
            b.settgl_lahir(frame.getTxttgl_lahir().getText());
            b.setjenis_kelamin(frame.getTxtjenis_kelamin().getText());
            b.setno_telp(frame.getTxtno_telp().getText());

            implSupir.insert(b); 
            JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        } catch(HeadlessException e)  {
            }
    }
   public void update() {
   if(!frame.getTxtid().getText().trim().isEmpty()){
        Supir b = new Supir();  
        b.setid(Integer.parseInt(frame.getTxtid().getText()));; 
        b.setnama(frame.getTxtnama().getText()); 
        b.setalamat(frame.getTxtalamat().getText()); 
        b.settgl_lahir(frame.getTxttgl_lahir().getText());
        b.setjenis_kelamin(frame.getTxtjenis_kelamin().getText()); 
        implSupir.update(b);  
    
        JOptionPane.showMessageDialog(null, "Update Data sukses");
        } else {
        JOptionPane.showMessageDialog(frame, "Pilih data yang akan di ubah");
        }
    }
        
        public void delete(){
            if (!frame.getTxtid().getText().trim().isEmpty()) 
            {

                int id = Integer.parseInt(frame.getTxtid().getText());
                implSupir.delete(id);
                JOptionPane.showMessageDialog(null, "Hapus Data sukses");
            } else {
                JOptionPane.showMessageDialog(frame, "Pilih data yang akan di hapus");
            }
        }
        
}