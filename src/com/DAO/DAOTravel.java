/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.koneksi.koneksi;
import com.model.Travel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane;
import com.DAOImplement.ImplementTravel;

/**
 *
 * @author FAISAL
 */
public class DAOTravel implements ImplementTravel {
    Connection connection;
    final String insert = "INSERT INTO booking (nama_pemesan, tujuan_id, tgl_keberangkatan, no_kursi,jam,harga, status_pembayaran_id) VALUES (?, ?, ?, ?, ?, ?, 'Belum Lunas');";
    final String update = "UPDATE booking set status_pembayaran_id=? WHERE id=? ;";
    final String delete = "DELETE FROM booking where id=? ;";
    final String select = "SELECT * FROM booking;";
    
    public DAOTravel() {
    connection = koneksi.getKoneksi();
    }
    
    public void insert(Travel b) { 
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS); 
            statement.setString(1, b.getNama_pemesan()); 
            statement.setString(2, b.getTujuan_id()); 
            statement.setString(3, b.getTgl_keberangkatan()); 
//            statement.setString(4, b.getMobil_id()); 
            statement.setInt(4, b.getNo_kursi()); 
            statement.setString(5, b.getJam());    
            statement.setString(6,b.getHarga());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void update(Travel b) { 
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(update,Statement.RETURN_GENERATED_KEYS);  
            statement.setString(1, b.getStatus_pembayaran());
            statement.setInt(2, b.getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            System.out.println(b.getStatus_pembayaran());
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void delete(int id) { 
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(delete,Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    
    public List<Travel> getALL() { 
        List<Travel> lb = null;
        try {
            lb = new ArrayList<Travel>(); 
            Statement st = connection.createStatement(); 
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Travel b = new Travel(); 
                b.setId(rs.getInt("id")); 
                b.setNama_pemesan(rs.getString("nama_pemesan")); 
                b.setTujuan_id(rs.getString("tujuan_id"));
                b.setTgl_keberangkatan(rs.getString("tgl_keberangkatan"));
                b.setNo_kursi(rs.getInt("no_kursi"));
                b.setJam(rs.getString("jam"));
                b.setStatus_pembayaran(rs.getString("status_pembayaran_id"));
                lb.add(b);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(DAOMobil.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return lb;
    }

    @Override
    public List<Travel> getCariId(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
}
