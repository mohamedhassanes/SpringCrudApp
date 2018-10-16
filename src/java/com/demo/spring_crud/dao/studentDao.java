/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.spring_crud.dao;

import com.demo.spring_crud.model.Student;
import java.util.List;

/**
 *
 * @author mohamed_es
 */
public interface studentDao {

    
    public List<Student> getAllStudents();
    
    
   public Student getStudentById(int std_id);
    
    
   public void insertStudent(Student std);
    
    
    public void updateStudent(Student std);

    
   public void deleteStudent(int std_id);
    
    
    
    
    
}
