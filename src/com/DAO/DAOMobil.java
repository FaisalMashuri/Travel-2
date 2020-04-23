/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

/**
 *
 * @author Fianti Savitri
 */
import com.koneksi.koneksi;
import com.model.mobil;
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
import com.DAOImplement.ImplementMobil;
public class DAOMobil implements ImplementMobil{
    
    
/**
*
* @author Firman Wisambudi
*/

    Connection connection;
    final String insert = "INSERT INTO mobil (id,no_polisi,tujuan_id) VALUES (?, ?, ?) ;";
    final String update = "UPDATE mobil set no_polisi=?, tujuan_id=? WHERE id=? ;";
    final String delete = "DELETE FROM mobil where id=? ;";
    final String select = "SELECT * FROM mobil;";
    
    public DAOMobil() {
    connection = koneksi.getKoneksi();
    }
    public void insert(mobil b) { 
        PreparedStatement statement = null; 
        try {
            statement = connection.prepareStatement(insert); 
            statement.setInt(1, b.getId()); 
            statement.setString(2, b.getNopol()); 
            statement.setString(3, b.getTujuan()); 
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
public void update(mobil b) { 
    PreparedStatement statement = null; 
    try {
        statement = connection.prepareStatement(update);  
        statement.setString(1, b.getNopol()); 
        statement.setString(2, b.getTujuan());
        statement.setInt(3, b.getId());
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
        } catch (SQLException ex) {
ex.printStackTrace();
} finally {try {
statement.close();
} catch (SQLException ex) {
ex.printStackTrace();
}
}
}
public List<mobil> getALL() { 
    List<mobil> lb = null;
try {
lb = new ArrayList<mobil>(); 
Statement st = connection.createStatement(); 
ResultSet rs = st.executeQuery(select);
while (rs.next()) {
    mobil b = new mobil(); 
    b.setId(rs.getInt("id")); 
    b.setNopol(rs.getString("no_polisi")); 
    b.setTujuan(rs.getString("tujuan_id")); 
    lb.add(b);
}
} catch (SQLException ex) { 
    Logger.getLogger(DAOMobil.class.getName()).log(Level.SEVERE, null,ex);
}
return lb;
}

}
