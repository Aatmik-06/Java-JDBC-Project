/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.dao;
import com.task.bean.EmpBean;
import com.task.utility.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adi18
 */
public class EmpDAO {
    static Connection conn;
    public int addStudent(EmpBean eb){
        
        conn = ConnectionPool.connectDB();
        
        int r = 0;
        
        String sql ="insert into emp values('"+eb.getEmpno()+"','"+eb.getEmpName()+"','"+eb.getJob()+"','"+eb.getMgr()+"','"+eb.getHireDate()+"','"+eb.getSalary()+"','"+eb.getComm()+"','"+eb.getDeptno()+"')";
        
        Statement stmt;
        
        try {
            stmt = conn.createStatement();
            
            r =stmt.executeUpdate(sql);
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return r;
    }
    
    public ArrayList<EmpBean>findAll(){
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        conn = ConnectionPool.connectDB();
       
        
        String sql = "select * from emp";
        
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
             ResultSet rs = stmt.executeQuery(sql);
             
              while (rs.next()){
                  EmpBean e = new EmpBean();
                  
                  e.setComm(rs.getFloat("Comm"));
                  e.setDeptno(rs.getInt("Deptno"));
                  e.setEmpName(rs.getString("Empname"));
                  e.setEmpno(rs.getInt("Empno"));
                  e.setHireDate(rs.getString("Hiredate"));
                  e.setJob(rs.getString("Job"));
                  e.setMgr(rs.getInt("Mgr"));
                  e.setSalary(rs.getDouble("Salary"));
                  list.add(e);
              }
              conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public int deleteEmp(int empNo){
        conn = ConnectionPool.connectDB();
        
        int r=0;
        
        String sql = "delete from emp where empno='"+empNo+"'";
        
        Statement stmt;
        
        try {
            stmt = conn.createStatement();
            
            r= stmt.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
       
    }
    
    public EmpBean findbyid(int empno){
        EmpBean eb = new EmpBean();
        conn = ConnectionPool.connectDB();
        
        String sql = "select * from emp where empno='"+empno+"'";
        
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                  eb.setComm(rs.getFloat("Comm"));
                  eb.setDeptno(rs.getInt("Deptno"));
                  eb.setEmpName(rs.getString("Empname"));
                  eb.setEmpno(rs.getInt("Empno"));
                  eb.setHireDate(rs.getString("Hiredate"));
                  eb.setJob(rs.getString("Job"));
                  eb.setMgr(rs.getInt("Mgr"));
                  eb.setSalary(rs.getDouble("Salary"));       
        }
        
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eb;
    }
      public int updateEmp(EmpBean eb){
        conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
       
       String sql="update emp set empname='"+eb.getEmpName()+"',job='"+eb.getJob()+"',mgr='"+eb.getMgr()+"',hiredate='"+eb.getHireDate()+"',salary='"+eb.getSalary()+"',comm='"+eb.getComm()+"',deptno='"+eb.getDeptno()+"' where empno='"+eb.getEmpno()+"'";
      
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            //step5:
        r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
    public static void main(String[] args) {
        
    }
    
    
}
