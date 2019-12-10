package com.him.springdemo;

public class CricketCoach implements Coach{
  
  private FortuneService fortuneService;
  private String emailAddress;
  private String team;
  
  public CricketCoach() {
    System.out.println("Inside no-arg cricketcoach constructor");
  }
 
  public void setFortuneService(FortuneService fortuneService) {
  System.out.println("Inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getTeam() {
    return team;
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
