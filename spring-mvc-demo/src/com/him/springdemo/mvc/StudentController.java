package com.him.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
  
//  mapping to page for submission of data
  @RequestMapping("/showForm")
  public String studentSubmissionForm(Model theModel) {
    
//    create student class object
    Student theStudent = new Student();
    
//    add student object to the model
    theModel.addAttribute("student", theStudent);
    
    return "student-form";
  }
  
//  process data submitted by student-form.jsp
  @RequestMapping("/processForm")
  public String studentSubmittedFormData(@ModelAttribute("student") Student theStudent) {

    //    log the submitted data
    System.out.println("Student first name: " +theStudent.getFirstName()+ "\nStudent last name: " +theStudent.getLastName() + 
    "\nStudent Country: " +theStudent.getCountryOptions());
    
    return "student-confirmation";
  }
  
}
