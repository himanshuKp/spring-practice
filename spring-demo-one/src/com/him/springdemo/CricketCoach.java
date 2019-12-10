package com.him.springdemo;

public class CricketCoach implements Coach{
  
  private FortuneService fortuneService;
  
  public CricketCoach() {
    System.out.println("Inside no-arg cricketcoach constructor");
  }
 
  public void setFortuneService(FortuneService fortuneService) {
  System.out.println("Inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Do a daily 15 min bowling practice";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
  
}
