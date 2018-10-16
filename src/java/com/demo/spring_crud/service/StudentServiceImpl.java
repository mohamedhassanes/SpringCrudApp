/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.spring_crud.service;

import com.demo.spring_crud.dao.studentDao;
import com.demo.spring_crud.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mohamed_es
 */
@Service
@Transactional
public class StudentServiceImpl implements studentService
{

    @Autowired
    studentDao std_dao;
    
    
    @Override
    public List<Student> getAllStudents() {
       
        return std_dao.getAllStudents();
        
    }

    
     @Override
    public Student getStudentById(int std_id) 
    {
      return std_dao.getStudentById(std_id); // returns Student Object
    }
    
    
    @Override
    public void insertStudent(Student std) {
        
        std_dao.insertStudent(std);
    }

    @Override
    public void updateStudent(Student newStudent)
    {
        std_dao.updateStudent(newStudent);
    }

    @Override
    public void deleteStudent(int std_id) {
        
        std_dao.deleteStudent(std_id);
        
    }

   
    
    
    

   
    
}
