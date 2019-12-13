package com.him.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

 @Autowired
 @Qualifier("randomFortuneService")
 private FortuneService fortuneService;
  
 @Value("${foo.email}")
 private String email;
  
 @Value("${foo.name}")
 private String name;
  
 public TennisCoach() {
   System.out.println("TennisCoach: Inside default constructor");
 }
  
  /*
   * @Autowired public TennisCoach(FortuneService theFortuneService) {
   * fortuneService = theFortuneService; }
   */
  
  /*
  @Autowired
  public void doFortuneService(FortuneService fortuneService) {
    System.out.println("Inside setter method for tennis coach : doFortuneService");
    this.fortuneService = fortuneService;
  }
  */
  
 @Override
  public String getDaillyWorkout() {
    return "Practice your backhand volley";
  }

 @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
  
 @Override
  public String getEmail() {
    return ("Coach email: "+email);
  }

 @Override
  public String getName() {
    return ("Coach name: " +name);
  }

}