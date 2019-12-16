package com.him.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

//  instance variable to be used in form
  private String firstName;
  private String lastName;
  //field for country 
  private String country;
  
  //  create a collection of country list
  private LinkedHashMap<String, String> countryOptions;
  
  public Student() {
    System.out.println("Inside student class constructor");
    
    //put data in country collection\
    countryOptions = new LinkedHashMap<String, String>();
    countryOptions.put("BR", "Brazil");
    countryOptions.put("FR", "France");
    countryOptions.put("DE", "Germany");
    countryOptions.put("IN", "India");
    countryOptions.put("CH", "China");
    countryOptions.put("RS", "Russia");
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

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

}
