/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.bean;

/**
 *
 * @author adi18
 */
public class EmpBean {
    private int Empno;
    private String EmpName;
    private String Job;
    private String Mgr;
    private int HireDate;
    private double Salary;
    private double Comm;
    private int Deptno;

    //    Constructor
//  non parameterised constructor 
    public EmpBean() {
    }
    
    //    Constructor
//  parameterised constructor 

    public EmpBean(int Empno, String EmpName, String Job, String Mgr, int HireDate, double Salary, double Comm, int Deptno) {
        this.Empno = Empno;
        this.EmpName = EmpName;
        this.Job = Job;
        this.Mgr = Mgr;
        this.HireDate = HireDate;
        this.Salary = Salary;
        this.Comm = Comm;
        this.Deptno = Deptno;
    }
    
    
//    Getter/Setter

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int Empno) {
        this.Empno = Empno;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getMgr() {
        return Mgr;
    }

    public void setMgr(String Mgr) {
        this.Mgr = Mgr;
    }

    public int getHireDate() {
        return HireDate;
    }

    public void setHireDate(int HireDate) {
        this.HireDate = HireDate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getComm() {
        return Comm;
    }

    public void setComm(double Comm) {
        this.Comm = Comm;
    }

    public int getDeptno() {
        return Deptno;
    }

    public void setDeptno(int Deptno) {
        this.Deptno = Deptno;
    }
    
    
}
