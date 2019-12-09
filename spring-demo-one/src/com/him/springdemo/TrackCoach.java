package com.him.springdemo;

public class TrackCoach implements Coach {

  //define a private field for dependency
  private FortuneService fortuneService;

  public TrackCoach() {
    
  }
  
  //define a constructor for dependency injection
  public TrackCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }
  
  @Override
  public String getDailyWorkout() {
     return "Give me a hard 5K";
  }

  @Override
  public String getDailyFortune() {
    //use my fortuneService to get a fortune
    //dependency = helper
    return "Just Do It: "+ fortuneService.getFortune();
  }

}
