
package com.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tableModelSupir extends AbstractTableModel{
        List<Supir>lb;
        public tableModelSupir(List<Supir>lb){
            this.lb=lb;
        }

        @Override
        public int getColumnCount(){
            return 6;
        }
        public int getRowColumn(){
            return lb.size();
        }        
        
        @Override
        public String getColumnName(int column){
            switch(column){
                case 0:
                    return "id";
                case 1 :
                    return "Nama";
                case 2 :
                    return "alamat";
                case 3 :
                    return "tgl_lahir";
                case 4:
                    return "no_telp";
                case 5 :
                    return "jenis_kelamin";
                default :
                    return null;
            }
        }
        
          @Override
        public Object getValueAt(int row, int column){
        switch(column){
            case 0:
                return lb.get(row).getid();
            case 1:
                return lb.get(row).getnama();
            case 2:
                return lb.get(row).getalamat();
            case 3:
                return lb.get(row).gettgl_lahir();
            case 4:
                return lb.get(row).getno_telp();
            case 5:
                return lb.get(row).getjenis_kelamin();
            default :
                    return null;    
                
        }
        
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}


