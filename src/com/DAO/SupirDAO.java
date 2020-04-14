package com.DAO;

import com.koneksi.koneksi;
import com.model.Supir;
import com.DAOImplement.implementSupir;
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


public class SupirDAO implements implementSupir {
    Connection connection;
    
    final String insert = "INSERT INTO tblSupir (id, nama,alamat, tgl_lahir,no_telp,jenis kelamin) VALUES (?, ?, ?,?);";
    final String update = "UPDATE tblSupir set nim=?, nama=?, jk=?, alamat=? where id=? ;";
    final String delete = "DELETE FROM tblSupir where id=? ;";
    final String select = "SELECT * FROM tblSupir;";
    final String carinama = "SELECT * FROM tblSupir where nama like ?";

    public SupirDAO() {
    connection = koneksi.getKoneksi();
    }
    public void insert(Supir b) { 
        PreparedStatement statement = null;
    try {
    statement = connection.prepareStatement(insert);
    statement.setInt(1, b.getid()); 
    statement.setString(2, b.getnama()); 
    statement.setString(3, b.gettgl_lahir()); 
    statement.setString(4, b.getjenis_kelamin()); 
    statement.setString(5, b.getalamat()); 
    statement.setString(6, b.getno_telp()); 


    statement.executeUpdate();
    
    ResultSet rs = statement.getGeneratedKeys();
    while (rs.next()) {
        b.setid(rs.getInt(1));
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
    public void update(Supir b) { 
    PreparedStatement statement = null; try {
        statement.setInt(1, b.getid()); 
        statement.setString(2, b.getnama()); 
        statement.setString(3, b.gettgl_lahir()); 
        statement.setString(4, b.getjenis_kelamin()); 
        statement.setString(5, b.getalamat()); 
        statement.setString(6, b.getno_telp()); 
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
    public void delete(int id) { 
        PreparedStatement statement = null; 
        try {
        statement = connection.prepareStatement(delete);
        statement.setInt(1, id);
        statement.executeUpdate();
        }   
        catch (SQLException ex) {
        ex.printStackTrace();
        }   
        finally {try {
        statement.close();
        } 
            catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
    }
    public List<Supir> getALL() 
    { List<Supir>lb = null;
    try {
        lb = new ArrayList<Supir>(); 
        Statement st = connection.createStatement(); 
        ResultSet rs = st.executeQuery(select);
        while (rs.next()) {
            Supir b = new Supir(); 
            b.setid(rs.getInt("id")); 
            b.setnama(rs.getString("nama")); 
            b.setnama(rs.getString("alamat")); 
            b.settgl_lahir(rs.getString("tgl_lahir")); 
            b.setno_telp(rs.getString("no_telp"));
            b.setjenis_kelamin(rs.getString("jenis_kelamin")
            );
            lb.add(b);
}
        } catch (SQLException ex) {
            Logger.getLogger(SupirDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
            return lb;
    }
    public List<Supir> getCariNama(String nama) 
    { List<Supir> lb = null;
    try {
    lb = new ArrayList<Supir>();
    
    PreparedStatement st = connection.prepareStatement(carinama);
    st.setString(1, "%" + nama + "%"); 
    ResultSet rs = st.executeQuery(); 
    while (rs.next()) {
    Supir b = new Supir(); 
            b.setid(rs.getInt("id")); 
            b.setnama(rs.getString("nama")); 
            b.setnama(rs.getString("alamat")); 
            b.settgl_lahir(rs.getString("tgl_lahir")); 
            b.setno_telp(rs.getString("no_telp"));
            b.setjenis_kelamin(rs.getString("jenis_kelamin")
            );
            lb.add(b);
    }
    
    } catch (SQLException ex) {
        Logger.getLogger(SupirDAO.class.getName()).log(Level.SEVERE,
                null,ex);
    }
    return lb;
    }
}


