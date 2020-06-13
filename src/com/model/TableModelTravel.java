/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FAISAL
 */
public class TableModelTravel extends AbstractTableModel {
    List<Travel> lb;
        public TableModelTravel(List<Travel> lb){
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
                    return "nama_pemasan";
                case 2 :
                    return "tujuan_id";
                case 3 :
                    return "tgl_berangkat";
                case 4:
                    return "status_pembayaran";
                case 5:
                    return "no_kursi";
                case 6:
                    return "jam";
                case 7:
                    return "harga";
                default :
                    return null;
            }
        }
        
          @Override
        public Object getValueAt(int row, int column){
        switch(column){
            case 0:
                return lb.get(row).getId();
            case 1:
                return lb.get(row).getNama_pemesan();
            case 2:
                return lb.get(row).getTujuan_id();
            case 3:
                return lb.get(row).getTgl_keberangkatan();
            case 4:
                return lb.get(row).getStatus_pembayaran();
            case 5:
                return lb.get(row).getNo_kursi();
            case 6:
                return lb.get(row).getJam();
            case 7:
                return lb.get(row).getHarga();
            default :
                    return null;    
                
        }
        
    }

    
//    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//   

    @Override
    
    public int getRowCount() {
        return lb.size();
    //To change body of generated methods, choose Tools | Templates.
    }
        
}
