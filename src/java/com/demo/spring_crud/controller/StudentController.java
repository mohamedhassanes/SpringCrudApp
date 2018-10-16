/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.spring_crud.controller;

import com.demo.spring_crud.model.Student;
import com.demo.spring_crud.service.studentService;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mohamed_es
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    
    @Autowired
    studentService std_service;
    
    
    
    @RequestMapping(value="/index" , method = RequestMethod.GET)
    public String getIndex()
    {
        return "/index";
    }
    
    
    @RequestMapping(value="/all" , method = RequestMethod.GET)
    public String getAllStudents(ModelMap mm)
    {
        
        //System.out.println("students count is : " + std_service.getAllStudents().size());
        
        mm.addAttribute("students", std_service.getAllStudents());
        
        return "all_students";
    }
    
    
    
    @RequestMapping(value="/add" , method = RequestMethod.GET)
    public String addStudent(ModelMap mm)
    {
        Student std = new Student();
        mm.addAttribute("student", std);
              
        return "add_student";
    }
    
    
    //we add ModelMap here to send empty student object ,due to empty the form textFields
    @RequestMapping(value="access_adding" , method = RequestMethod.POST )
    public String accessAdding(@ModelAttribute Student student , ModelMap mm)
   {
        //System.out.println(student.getStudentName());

       std_service.insertStudent(student);
       
       mm.addAttribute("student", new Student());
        return "add_student";
    }
    
    
    
    
    
    
     @RequestMapping(value="/update/{std_id}" , method = RequestMethod.GET )
    public String getUpdate(@PathVariable int std_id , ModelMap mm)
   {
       
             // System.out.println("From update page , id is: " + std_id);
       Student oldStudent = std_service.getStudentById(std_id);
             //System.out.println("old student name is: "+ oldStudent.getStudentName());
       
             mm.addAttribute("student", oldStudent);
             
             System.out.println("from get_update .. student id = " + oldStudent.getStudentId());
             
        return "update_student";
    }
    
    
    @RequestMapping(value="/update" , method = RequestMethod.POST )
    public String accessUpdate(@ModelAttribute(value = "student") Student newStudent)
   {
      
       
       
       std_service.updateStudent( newStudent );
       
        return "redirect:/student/all";
    }
    
    
    @RequestMapping(value = "/delete/{std_id}" , method = RequestMethod.GET)
    public String deleteStudent(@PathVariable int std_id )
    {
        
        std_service.deleteStudent(std_id);
        
        return "redirect:/student/all";
    }
    
    
}
