package com.him.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
  
}
