/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.beans;

/**
 *
 * @author vipin
 */
public class AccountantBeans {
    
    private String uname,pass,name,dob,sex,qul;
    private float sal;
    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setQul(String qul) {
        this.qul = qul;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
    

    public String getUname() {
        return uname;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getSex() {
        return sex;
    }

    public String getQul() {
        return qul;
    }

    public float getSal() {
        return sal;
    }
    
    
}
