/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.bean;

/**
 *
 * @author adi18
 */
public class UsersBean {
    
    private int Uid;
    private String Name;
    private String UserName;
    private String Password;
    private String Email;
    private String Mobile;

    //    making default constructor 
    public UsersBean() {
    }
    
    //    making parametered constructor 

    public UsersBean(int Uid, String Name, String UserName, String Password, String Email, String Mobile) {
        this.Uid = Uid;
        this.Name = Name;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.Mobile = Mobile;
    }
    
    
//    Getter/Setter

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    
    
    
    
    
    
}
