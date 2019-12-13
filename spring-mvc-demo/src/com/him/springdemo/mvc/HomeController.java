package com.him.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//  add a request mapping and link '"/" to below method
//  return view-name
  @RequestMapping("/")
  public String indexPage() {
    return "index";
  }
  
}
