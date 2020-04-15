/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author FAISAL
 */
public class koneksi {
    Connection con;
    Statement stm;
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost/travel_desktop";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
                
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return koneksi;
    }
    
//    public void config(){
//           try {
//               Class.forName("com.mysql.jdbc.Driver");
//               con=DriverManager.getConnection("jdbc:mysql://localhost/travel_desktop", "root", "");
//               stm = con.createStatement();
//           } catch (Exception ex) {
//               System.out.println(ex);
//           }
//       }   
}
    

    
