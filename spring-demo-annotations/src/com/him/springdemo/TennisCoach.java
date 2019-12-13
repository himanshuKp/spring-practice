package com.him.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("happyFortuneService")
  private FortuneService fortuneService;
  
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

}
