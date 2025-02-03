/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.dao;
import com.task.bean.EmpBean;
import com.task.utility.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
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
    
    public ArrayList<EmpBean> findbydeptno(int deptno){
       
        conn = ConnectionPool.connectDB();
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        String sql = "select * from emp where deptno='"+deptno+"'";
        
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
    
    public ArrayList<EmpBean> findbyjob(String job){
       
        conn = ConnectionPool.connectDB();
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        String sql = "select * from emp where job='"+job+"'";
        
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
    
    
     public ArrayList<EmpBean>sortBySalAsc(){
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        conn = ConnectionPool.connectDB();
       
        
        String sql = "SELECT * FROM emp ORDER BY salary Asc;";
        
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
     
    public ArrayList<EmpBean>sortBySalDesc(){
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        conn = ConnectionPool.connectDB();
       
        
        String sql = "SELECT * FROM emp ORDER BY salary Desc;";
        
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
    
    public ArrayList<EmpBean>sortByNameAsc(){
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        conn = ConnectionPool.connectDB();
       
        
        String sql = "SELECT * FROM emp ORDER BY empname Asc;";
        
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
    
     public ArrayList<EmpBean>sortByNameDesc(){
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        conn = ConnectionPool.connectDB();
       
        
        String sql = "SELECT * FROM emp ORDER BY empname Desc;";
        
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
     
    public double sumSalary(){
       double totalSalary = 0; 
  
        conn = ConnectionPool.connectDB();
        
        String sql = "select sum(salary) as totalsalary from emp";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getDouble("totalsalary");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       return totalSalary;
    } 
    
     public double sumSalByDeptNo(int deptno){
       
        conn = ConnectionPool.connectDB();
        
        double totalSalary = 0;
        
        String sql = "SELECT sum(salary) AS totalsalary FROM emp WHERE deptno = '"+deptno+"' ";;
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getDouble("totalsalary");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       return totalSalary;
    }
     
    public double sumSalByJob(String job){
       
        conn = ConnectionPool.connectDB();
        
        double totalSalary = 0;
        
        String sql = "SELECT SUM(salary) as totalSalary FROM emp WHERE job = '"+job+"'";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getDouble("totalsalary");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       return totalSalary;
    } 
    
    public double avgSal(){
       
        conn = ConnectionPool.connectDB();
        
        double totalSalary = 0;
        
        String sql = "SELECT AVG(salary) as totalSalary FROM emp";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getDouble("totalsalary");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       return totalSalary;
    } 
    
    public double avgSalByJob(String job){
       
        conn = ConnectionPool.connectDB();
        
        double totalSalary = 0;
        
        String sql = "SELECT AVG(salary) as totalSalary FROM emp WHERE job = '"+job+"'";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getDouble("totalsalary");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       return totalSalary;
    } 
    
     public EmpBean maxSal(){
       
        conn = ConnectionPool.connectDB();
        
        String sql = "SELECT * FROM emp WHERE salary = (SELECT MAX(salary) FROM emp)";
        
        EmpBean eb = new EmpBean();
             
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
    
     public EmpBean minSal(){
       
        conn = ConnectionPool.connectDB();
        
        String sql = "SELECT * FROM emp WHERE salary = (SELECT MIN(salary) FROM emp)";
        
        EmpBean eb = new EmpBean();
             
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
     
     public ArrayList<EmpBean> topFiveHighSal(){
        
        conn = ConnectionPool.connectDB();
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        String sql = "SELECT * FROM emp ORDER BY salary DESC LIMIT 5";
             
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
     
    public ArrayList<EmpBean> topFiveLowestSal(){
        
        conn = ConnectionPool.connectDB();
        
        ArrayList<EmpBean> list = new ArrayList<EmpBean>();
        
        String sql = "SELECT * FROM emp ORDER BY salary ASC LIMIT 5";
             
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
    
     public int countNumnerOfEmp(){
       int totalEmp = 0; 
  
        conn = ConnectionPool.connectDB();
        
        String sql = "SELECT COUNT(*) AS NumberOfEmployees FROM emp";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalEmp = rs.getInt("NumberOfEmployees");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return totalEmp;
    } 
    
     
    public int countEmpByJob(String job){
       
        conn = ConnectionPool.connectDB();
        
        int totalSalary = 0;
        
        String sql = "SELECT COUNT(*) AS employee_count FROM emp where job = '"+job+"'";
        
        Statement stmt;
  
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
                 totalSalary = rs.getInt("employee_count");
        }
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       return totalSalary;
    } 
    
    
    
    public static void main(String[] args) {
    
        EmpDAO ed = new EmpDAO();
        
        Scanner scanner = new Scanner(System.in);
        
//        System.out.println("Total Salary: "+ed.sumSalary());
//        System.out.println(" ");
//        
//        System.out.print("Enter Department Number :");
//        int deptno = scanner.nextInt();
//        System.out.println("Total salary Department Wise: "+ed.sumSalByDeptNo(deptno));
//        System.out.println(" ");
//                
//        System.out.print("Enter Job for sum salary:");
//        String jobSalSum = scanner.next();
//        System.out.println("Total salary Job Wise: "+ed.sumSalByJob(jobSalSum));
//        System.out.println(" ");
//                    
//        System.out.println("Average salary: "+ed.avgSal());
//        System.out.println(" ");
//        
//        System.out.print("Enter Job for average salary :");
//        String jobSalAvg = scanner.next();
//        System.out.println("Average salary Job Wise: "+ed.avgSalByJob(jobSalAvg));
//        System.out.println(" ");
//        
//        System.out.println("Maximum salary: "+ed.avgSal());
//        System.out.println(" ");
     
//          EmpBean eb = ed.maxSal();
//          System.out.println("Maximum Salaried Employee :");  
//          System.out.println(eb.getEmpName()+"\t"+"\t"+eb.getHireDate()+"\t"+eb.getJob()+"\t"+eb.getComm()+"\t"+eb.getDeptno()+"\t"+eb.getEmpno()+"\t"+eb.getMgr()+"\t"+eb.getSalary());
//          System.out.println(" ");
          
           
//          System.out.println("Top 5 Highest Salaried Employee :"); 
//          ArrayList<EmpBean> li = ed.topFiveHighSal();
//          
//          for(EmpBean ebb:li){
//            System.out.println(ebb.getEmpName()+"\t"+"\t"+ebb.getHireDate()+"\t"+ebb.getJob()+"\t"+ebb.getComm()+"\t"+ebb.getDeptno()+"\t"+ebb.getEmpno()+"\t"+ebb.getMgr()+"\t"+ebb.getSalary());
//          }
//          System.out.println(" ");

//          EmpBean eb = ed.minSal();
//          System.out.println("Minimum Salaried Employees :");  
//          System.out.println(eb.getEmpName()+"\t"+"\t"+eb.getHireDate()+"\t"+eb.getJob()+"\t"+eb.getComm()+"\t"+eb.getDeptno()+"\t"+eb.getEmpno()+"\t"+eb.getMgr()+"\t"+eb.getSalary());
//          System.out.println(" ");
          
          
//           System.out.println("Top 5 Lowest Salaried Employees :"); 
//          ArrayList<EmpBean> li = ed.topFiveLowestSal();
//          
//          for(EmpBean ebb:li){
//            System.out.println(ebb.getEmpName()+"\t"+"\t"+ebb.getHireDate()+"\t"+ebb.getJob()+"\t"+ebb.getComm()+"\t"+ebb.getDeptno()+"\t"+ebb.getEmpno()+"\t"+ebb.getMgr()+"\t"+ebb.getSalary());
//          }
//          System.out.println(" ");
          
          
//        System.out.println("Total Employees: "+ed.countNumnerOfEmp());
//        System.out.println(" ");
        
        
        System.out.print("Enter Job for Counting Employees :");
        String countEmpByJob = scanner.next();
        System.out.println("Total Employees by Job: "+ed.countEmpByJob(countEmpByJob));
        System.out.println(" ");
          
          
        
    }
    
    
}
