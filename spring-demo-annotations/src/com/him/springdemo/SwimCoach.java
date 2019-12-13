package com.him.springdemo;

public class SwimCoach implements Coach {

  private FortuneService fortuneService;
  
  public SwimCoach(FortuneService theFortuneService) {
   this.fortuneService = theFortuneService;
  }
  
  @Override
  public String getDaillyWorkout() {
    // TODO Auto-generated method stub
    return "Swim 1000m to get shaped";
  }

  @Override
  public String getDailyFortune() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getEmail() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return null;
  }

}
