package com.him.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

//  list all random string fortune array
  public String[] fortune= {
      "Leadership is defined by results not attributes",
      "True leadership must have followership",
      "Before you are a leader, success is all about growing yourself"
  };
  
//  generate a random number
  Random random = new Random();
  
  @Override
  public String getFortune() {
    
//    choose a random option of the string array given above
    int messageOption = random.nextInt(fortune.length);
    
//    return a random message
    return fortune[messageOption];
  }

}
