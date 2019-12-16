package com.him.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

//  instance variable to be used in form
  private String firstName;
  private String lastName;
  //field for country 
  private String country;
  private String favoriteLanguage;
  private String favoriteOS;
  
  //  create a collection of country list
  private LinkedHashMap<String, String> countryOptions;
  
  private LinkedHashMap<String, String> favoriteLanguageOptions;
  
  private LinkedHashMap<String, String> favoriteOSOptions;
  
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
    
    //put data in favorite computer language collection
    favoriteLanguageOptions = new LinkedHashMap<String, String>();
    favoriteLanguageOptions.put("Java", "Java");
    favoriteLanguageOptions.put("PHP", "PHP");
    favoriteLanguageOptions.put("C#", "C#");
    favoriteLanguageOptions.put("Ruby", "Ruby");
    
    //put data in favorite computer os collection
    favoriteOSOptions = new LinkedHashMap<String, String>();
    favoriteOSOptions.put("Linux","Linux");
    favoriteOSOptions.put("Mac","Mac");
    favoriteOSOptions.put("Windows","Windows");
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

public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favoriteLanguage) {
	this.favoriteLanguage = favoriteLanguage;
}

public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
	return favoriteLanguageOptions;
}

public LinkedHashMap<String, String> getFavoriteOSOptions() {
	return favoriteOSOptions;
}

public String getFavoriteOS() {
	return favoriteOS;
}

public void setFavoriteOS(String favoriteOS) {
	this.favoriteOS = favoriteOS;
}



}
