package com.him.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
//@ComponentScan("com.him.springdemo")
public class SportConfig {

  @Bean
  public FortuneService happyFortuneService() {
    return new HappyFortuneService();
  }
  
  @Bean
  public FortuneService randomFortuneService() {
    return new RandomFortuneService();
  }
  
  @Bean
  public Coach swimCoach() {
    return  new SwimCoach(happyFortuneService());
  }
  
  @Bean
  public Coach tennisCoach() {
    return new TennisCoach(randomFortuneService());
  }
  
}
