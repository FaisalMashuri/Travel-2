/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.koneksi.koneksi;

import com.model.tujuan;

import com.DAOImplement.ImplementTujuan;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;import
        
java.sql.SQLException;import
        
java.sql.Statement;import
         
java.util.ArrayList;import
         
java.util.List;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.swing.JOptionPane;
/**
 *
 * @author Raisya Rahma
 */
public class daoTujuan implements ImplementTujuan{
    
Connection connection;

final String insert = "INSERT INTO tujuan(tujuan,harga,jam_id) VALUES(?,?,?);";

final String update = "UPDATE tujuan set tujuan=?,harga=?,jam_id=? where id=?;";

final String delete = "DELETE FROM tujuan where id=?;";

final String select = "SELECT * FROM tujuan;";

final String cariid = "SELECT * FROM tujuan where id like?";

public daoTujuan(){
    
    connection=koneksi.getKoneksi();
    
}

public void insert(tujuan b){
    PreparedStatement statement = null;
    try {
        
    statement=connection.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
    
    statement.setString(1,b.getTujuan());
    
    statement.setInt(2, b.getHarga());
    
    statement.setString(3, b.getJam());
    
    statement.executeUpdate();
    
    ResultSet rs = statement.getGeneratedKeys();
    
    while (rs.next()){
        
        b.setId(rs.getInt(1));
        
    }
    
    
    } catch (SQLException ex){
        
       ex.printStackTrace();
       
       
    } finally{
        
        try{
            
            statement.close();
            
        } catch (SQLException ex){
            
            ex.printStackTrace();
            
        }
        
        }
    
       }
       
       public void update(tujuan b){
           PreparedStatement statement = null;
           try
           {
               
               statement = connection.prepareStatement(update,Statement.RETURN_GENERATED_KEYS);
           
               statement.setString(2, b.getTujuan());
               
               statement.setInt(3, b.getHarga());
               
               statement.setString(4, b.getJam());
               
               statement.setInt(1, b.getId());
               
               
           } catch (SQLException ex){
               
               ex.printStackTrace();
               
           } finally {
           
           
                try{
                    
                    statement.close();
                    
                } catch (SQLException ex){
                    
                    ex.printStackTrace();
                    
                }
                
                }
           
                }
       
                
                public void delete(int id){
                    PreparedStatement statement = null;
                    try
                    {
                        statement = connection.prepareStatement(delete,Statement.RETURN_GENERATED_KEYS);
                    
                    
                        statement.setInt(1, id);
                        
                        statement.executeUpdate();
                        
                        
                    } catch (SQLException ex){
                        
                        ex.printStackTrace();
                    } finally {try{
                        
                        statement.close();
                        
                    } catch (SQLException ex){
                        
                        ex.printStackTrace();
                        
                    }
                    
                    }
                    
                    }
                

public List<tujuan> getALL()
{List<tujuan> lb = null;

try{

    lb = new ArrayList<tujuan>();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(select);

    while (rs.next()){


        tujuan b = new tujuan();

        b.setId(rs.getInt("id"));
        
        b.setTujuan(rs.getString("tujuan"));

        b.setHarga(rs.getInt("harga"));

        b.setJam(rs.getString("jam_id")
        );

        lb.add(b);

        }

        } catch (SQLException ex){
            Logger.getLogger(daoTujuan.class.getName()).log(Level.SEVERE,null,ex);
        }

        return lb;

        }


        public List<tujuan> getCariId(int Id)
        {List<tujuan>lb = null;

    try{
        
        lb= new ArrayList<tujuan>();

        PreparedStatement st= connection.prepareStatement(cariid);

        st.setString(1,"%"+Id+"%");
        ResultSet rs=st.executeQuery();
        while (rs.next()){

            tujuan b = new tujuan();
            
            b.setId(rs.getInt("id"));
            b.setTujuan(rs.getString("tujuan"));
            b.setHarga(rs.getInt("harga"));
            b.setJam(rs.getString("jam")
        );

        lb.add(b);

        }
    }catch(SQLException ex){
        Logger.getLogger(daoTujuan.class.getName()).log(Level.SEVERE,null,ex);
    }
        return lb;
        }
        }