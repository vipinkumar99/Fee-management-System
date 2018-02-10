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
public class StudentBeans {
    
    private String name,email,sex,course,mobile;
    private float fee,feepaid,duefee;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDuefee(float duefee) {
        this.duefee = duefee;
    }

    public float getDuefee() {
        return duefee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public void setFeepaid(float feepaid) {
        this.feepaid = feepaid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getCourse() {
        return course;
    }

    public String getMobile() {
        return mobile;
    }

    public float getFee() {
        return fee;
    }

    public float getFeepaid() {
        return feepaid;
    }
    
    
}
