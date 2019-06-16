package com.sampleproject.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//Create new Student object
		Student student = new Student();
		//add as model attribute
		model.addAttribute(student);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student newStudent) {
		//log the data
		System.out.println("Student info = "+newStudent.getFirstName()+ " " +newStudent.getLastName()+" "+newStudent.getCountry()); 
		return "student-confirmation";
	}
}
