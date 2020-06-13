/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

/**
 *
 * @author LENOVO
 */
import com.koneksi.koneksi;
import com.model.pegawai;
import com.DAOImplement.implementPegawai;
import java.sql.*;
import java.util.ArrayList;
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane;

public class PegawaiDAO implements implementPegawai{
    Connection connection;
    final String insert = "INSERT INTO pegawai(Id, nama, email, password, tgl_lahir) VALUES(?,?,?,?,?);";
    final String update = "UPDATE pegawai set nama=?, email=?, password=?, tgl_lahir=? where id=?;";
    final String delete = "DELETE FROM pegawai where id=?;";
    final String select = "SELECT*FROM pegawai;";
    final String carinama = "SELECT*FROM pegawai where nama like?";
    
    public PegawaiDAO() {
        connection = koneksi.getKoneksi();
    }
    
    public void insert(pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getEmail());
            statement.setString(4, b.getPassword());
            statement.setString(5, b.getTgl_lahir());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            while(rs.next()) {
                b.setId(rs.getInt(1));
            }
        }
        
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        finally {
            try {
                statement.close();
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void update(pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(5, b.getId());
            statement.setString(1, b.getNama());
            statement.setString(2, b.getEmail());
            statement.setString(3, b.getPassword());
            statement.setString(4, b.getTgl_lahir());
            statement.executeUpdate();
        }
        
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        finally {
            try {
                statement.close();
            }
            
            catch(SQLException ex) {
            ex.printStackTrace();
            }
        }
    }
    
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, id);
            statement.executeUpdate();
        }
        
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        finally {
            try {
                statement.close();
            }
            
            catch(SQLException ex) {
            ex.printStackTrace();
            }
        }
    }
    
    public List<pegawai> getALL() {
        List<pegawai>lb=null;
        try {
            lb = new ArrayList<pegawai>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            
            while(rs.next()) {
                pegawai b = new pegawai();
                b.setId(rs.getInt("id"));
                b.setNama(rs.getString("nama"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getString("password"));
                b.setTgl_lahir(rs.getString("tgl_lahir"));
                
                lb.add(b);
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lb;
    }
        
    public List<pegawai> getCariNama(String nama) {
        List<pegawai>lb=null;
        try {
            lb = new ArrayList<pegawai>();
            
            PreparedStatement st = connection.prepareStatement(carinama);
            
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                pegawai b = new pegawai();
                b.setId(rs.getInt("id"));
                b.setNama(rs.getString("nama"));
                b.setEmail(rs.getString("email"));
                b.setPassword(rs.getString("password"));
                b.setTgl_lahir(rs.getString("tgl_lahir"));
                lb.add(b);
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lb; 
    }
}
