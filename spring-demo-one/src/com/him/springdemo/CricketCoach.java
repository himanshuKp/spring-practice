package com.him.springdemo;

public class CricketCoach implements Coach{
  
  private FortuneService fortuneService;
  
  public CricketCoach() {
    System.out.println("Inside no-arg cricketcoach constructor");
  }
 
  protected void setFortuneService(FortuneService fortuneService) {
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
