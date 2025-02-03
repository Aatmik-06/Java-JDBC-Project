/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.utility;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adi18
 */
public class ConnectionPool {
     static Connection conn;
     public static Connection connectDB(){
         
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","2005");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         return conn; 
     }
     public static void main(String[] args) {
         connectDB();
        
    }
         
    
}
