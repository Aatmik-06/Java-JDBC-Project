/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.dao;

import com.task.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.task.bean.UsersBean;

/**
 *
 * @author adi18
 */

public class UsersDAO {
    static Connection conn;
    public int registerUser(UsersBean ub){
        conn= ConnectionPool.connectDB();
         String sql="insert into users values('"+ub.getUid()+"','"+ub.getName()+"','"+ub.getUserName()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobile()+"')";
        //step4:
        Statement stmt;
        int r=0;
        try {
            stmt = conn.createStatement();
            r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return r;
    }
    
     public int loginCheck(String username,String password){
          conn= ConnectionPool.connectDB();
          int id = 0 ;
         String sql="select uid from users where username ='"+username+"' and password='"+password+"'";
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return id;
     }
     public static void main(String[] args) {
        
    }
   }
