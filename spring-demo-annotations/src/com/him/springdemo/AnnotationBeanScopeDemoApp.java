package com.him.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
  
  public static void main(String[] args) {
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Coach theCoach = context.getBean("tennisCoach",Coach.class);
    
//    Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
    
//    boolean result = (theCoach == alphaCoach);
    
//    System.out.println("Are both theCoach and alphaCoach share same bean: " +result);
    
    System.out.println("Address of theCoach: " +theCoach);
    
//    System.out.println("Address of alphaCoach: " +alphaCoach);

    context.close();
  }
  
}
