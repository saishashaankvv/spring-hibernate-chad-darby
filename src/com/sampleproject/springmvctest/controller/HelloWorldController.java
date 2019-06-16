package com.sampleproject.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//need a controller method for showing form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method for processing form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to add data to the model and output it
	@RequestMapping("/capitalizeName")
	public String screamMyName(HttpServletRequest request, Model model) {
		//read request parameter from html form
		String name = request.getParameter("studentName");
		//convert data to all caps
		String capitalName = name.toUpperCase();
		//create the message 
		model.addAttribute("message", capitalName);
		//add message to model
		return "helloworld";
	}
	
	//new controller method to use @RequestParam annotation
		@RequestMapping("/capitalizeNameWhileUsingRequestParams")
		public String screamMyNameWhileUsingRequestParams(@RequestParam("studentName") String name, Model model) {
			//convert data to all caps
			String capitalName = "Whats Up! "+name.toUpperCase();
			//create the message 
			model.addAttribute("message", capitalName);
			//add message to model
			return "helloworld";
		}
}
