package com.sampleproject.springmvctest.controller;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String country;
	private String lastName;
	private String favoriteLang;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLangOptions;
	private LinkedHashMap<String, String> checkboxOptions;
	private String[] operatingSystems;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("AUS", "Australia");
		countryOptions.put("IND", "India");
		countryOptions.put("ITA", "Italy");
		
		favoriteLangOptions = new LinkedHashMap<String, String>();
		favoriteLangOptions.put("Java", "Java");
		favoriteLangOptions.put("PHP", "PHP");
		favoriteLangOptions.put("Ruby", "Ruby");
		favoriteLangOptions.put("Haskell", "Haskell");
		
		checkboxOptions = new LinkedHashMap<String, String>();
		checkboxOptions.put("Mac", "Mac OS");
		checkboxOptions.put("Windows", "Windows");
		checkboxOptions.put("Linux", "Linux");
	}
	
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
	
	public LinkedHashMap<String, String> getCountryOptions(){
		return countryOptions;
	}

	public String getFavoriteLang() {
		return favoriteLang;
	}

	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}

	public LinkedHashMap<String, String> getFavoriteLangOptions(){
		return favoriteLangOptions;
	}

	public LinkedHashMap<String, String> getCheckboxOptions() {
		return checkboxOptions;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}



}
