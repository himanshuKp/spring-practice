package com.him.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;
  
  /*
   * @Autowired public TennisCoach(FortuneService theFortuneService) {
   * fortuneService = theFortuneService; }
   */
  
  public TennisCoach() {
    System.out.println("TennisCoach: Inside default constructor");
  }
  
  @Autowired
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Inside setter method for tennis coach : setFortuneService");
    this.fortuneService = fortuneService;
  }
  
  @Override
  public String getDaillyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
