package com.him.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

  public static void main(String[] args) {
    
//    read spring config file
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
    
//    get the bean from spring container
    Coach theCoach = context.getBean("tennisCoach",Coach.class);
    
//    call a method on the bean
    System.out.println(theCoach.getDaillyWorkout());
    
    System.out.println(theCoach.getDailyFortune());
    
    /*//can be used with xml config for now
    System.out.println(theCoach.getEmail());
    
    System.out.println(theCoach.getName());
    */
//    close the context
    context.close();

  }

}
