/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.spring_crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mohamed_es
 */
@Entity
@Table(name = "student")
public class Student 
{
    
    @Id
    @Column(name="std_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    
    @Column(name="std_name")
    private String studentName;
    
    
    @Column(name="std_age")
    private int studentAge;
    
    
    @Column(name="std_phone")
    private String studentPhone;
    
    
    @Column(name="std_address")
    private String studentAddress;

    
    
    
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
   
    
    
    
    
    
    
}
