package com.sampleproject.springmvctest.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

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

	private String firstName;
	
	
	@NotNull(message = "Lastname is required")
	@Size(min=1, message="Lastname is required")
	private String lastName;
}
