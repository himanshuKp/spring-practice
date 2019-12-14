package com.him.springdemo.mvc;

public class Student {

//  instance variable to be used in form
  private String firstName;
  private String lastName;
  
  public Student() {
    System.out.println("Inside student class constructor");
  }
  
//generate name getters and setter

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
}
