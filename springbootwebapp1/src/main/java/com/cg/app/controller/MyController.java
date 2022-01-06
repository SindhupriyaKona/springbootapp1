package com.cg.app.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	
	@RequestMapping("/") //root URI

	public String launchHomePage() {
		
		
		return "index";
	}
	
	@RequestMapping("/add")

	public String handleAdd(int num1,int num2,Model model) {
		
	int result=num1+num2;
		
		model.addAttribute("resultData",result);
		return "welcome"; //logical name of physical jsp page
	}
	
}
