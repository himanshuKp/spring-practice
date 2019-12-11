package com.him.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

  public static void main(String[] args) {
    
//    load the spring configuration file
    ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
    
//    retrieve bean from spring container
    Coach theCoach = theContext.getBean("myCoach",Coach.class);
    
    System.out.println(theCoach.getDailyFortune());
    
//    close the spring context
    theContext.close();
  }

}
