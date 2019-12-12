package com.him.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Override
  public String getDaillyWorkout() {
    return "Practice your backhand volley";
  }

}
