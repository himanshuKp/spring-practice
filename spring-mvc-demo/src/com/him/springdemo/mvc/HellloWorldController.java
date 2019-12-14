package com.him.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HellloWorldController {
  
//  need a form to submit the request
  
  @RequestMapping("/showForm")
  public String showForm() {
    return "helloWorld-form";
  }
  
  
//  need a form to process the request
  @RequestMapping("/processForm")
  public String processForm() {
    return "helloWorld";
  }
  
//  load the data from the form and send it to model
  @RequestMapping("/processFormVersionTwo")
  public  String letsShoutDude(HttpServletRequest request, Model model) {
    
//    read the request parameter from HTML form
    String theName = request.getParameter("studentName");
    
//    convert the data to all upper case
    theName = theName.toUpperCase();
    
//    create the message
    String result = "Yo! " +theName;
    
//    add data to the model
    model.addAttribute("message", result);
    
    return "helloWorld";
  }
  
//  process form version 3 using @RequestParam
  @RequestMapping("/processFormVersionThree")
  public String processFormVersionThree(
      @RequestParam("studentName") String theName, Model model
      ) {
    
//    update the studentName to allUpperCase
    theName = theName.toUpperCase();
    
//    message 
    String result = "Hello mate! " +theName;
    
//    bind the model to the view
    model.addAttribute("message", result);
    
    return "helloWorld";
  }
  
}
