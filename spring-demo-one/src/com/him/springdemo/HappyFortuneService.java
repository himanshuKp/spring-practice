package com.him.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

  private String myFortunes[] = {"My first fortune",
                               "My second fortune",
                               "My Third Fortune"};
  
  @Override
  public String getFortune() {
    
    int randomInt = new Random().nextInt(myFortunes.length);
    return myFortunes[randomInt];
    
  }

}
