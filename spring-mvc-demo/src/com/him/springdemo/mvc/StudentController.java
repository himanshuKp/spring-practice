package com.him.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
  
	// register customer editor to our controller, trim all leading and 
	// trailing whitespaces. resolves issue of our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
//  mapping to page for submission of data
  @RequestMapping("/showForm")
  public String studentSubmissionForm(Model theModel) {
    
//    create student class object
    Student theStudent = new Student();
    
//   add student object to the model
    theModel.addAttribute("student", theStudent);
    
    return "student-form";
  }
  
//  process data submitted by student-form.jsp
  @RequestMapping("/processForm")
  public String studentSubmittedFormData(
		  @Valid @ModelAttribute("student") Student theStudent,
		  BindingResult bindingResult) {

    //    log the submitted data
    System.out.println("Student first name: " +theStudent.getFirstName()+ "\nStudent last name: " +theStudent.getLastName() + 
    "\nStudent Country: " +theStudent.getCountryOptions()+"\nStudent Language: "
    +theStudent.getFavoriteLanguageOptions());

    System.out.println("\nFirstname: |"+theStudent.getFirstName()+"|\nLastname: |"+theStudent.getLastName()+"|");
    
    System.out.println("\nYears of Experience: |"+theStudent.getYearsOfExperience()+"|");
    
    System.out.println("\nPostal Code: |"+theStudent.getPostalCode()+"|");
    
    System.out.println("Binding result: " +bindingResult);
    
    if(bindingResult.hasErrors()) {
    	return "student-form";
    }
    else {
    	return "student-confirmation";
    }   
  }
  
}
