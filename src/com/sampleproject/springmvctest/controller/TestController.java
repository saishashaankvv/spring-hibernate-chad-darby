package com.sampleproject.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
