/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.spring_crud.dao;

import com.demo.spring_crud.model.Student;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mohamed_es
 */
@Repository
public class StudentDaoImpl implements studentDao
{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Student> getAllStudents() {
      
        List<Student> allStudents;
        
        Session se = sessionFactory.getCurrentSession();
        
        Query q = se.createQuery("from Student");
        
        return q.list();
        
   }

    
    @Override
    public void insertStudent(Student std) {
         
        Session se = sessionFactory.getCurrentSession();
        se.save(std);
        
   }

    
    
     @Override
    public Student getStudentById(int std_id)
    {
        Session se = sessionFactory.getCurrentSession();
        
        Student student =(Student) se.get(Student.class,  std_id );
        
        return student;
    }
    
    
    
    
    @Override
    public void updateStudent(Student newStudent) 
    {
        Session se = sessionFactory.getCurrentSession();
     
       // System.out.println("From dao : newStudent id is :"+ newStudent.getStudentId() +"and name is: "+ newStudent.getStudentName());
        
        //se.createQuery("update Student set std_name ='"+newStudent.getStudentName()+"' where std_id ="+newStudent.getStudentId()+"  ").executeUpdate();
        
        
        Student currentStudent = (Student) se.get(Student.class, newStudent.getStudentId() );
        
        currentStudent.setStudentName(newStudent.getStudentName());
        currentStudent.setStudentAge(newStudent.getStudentAge());
        currentStudent.setStudentPhone(newStudent.getStudentPhone());
        currentStudent.setStudentAddress(newStudent.getStudentAddress());
        
        
        
        
    }

    
    
    @Override
    public void deleteStudent(int std_id)
    {
        Session se = sessionFactory.getCurrentSession();
        
        Student studentToDelete = (Student) se.get(Student.class, std_id);
        
        se.delete(studentToDelete);
        
    }
    
    
    
    
    
    
    
    
    
    

    

   
}
