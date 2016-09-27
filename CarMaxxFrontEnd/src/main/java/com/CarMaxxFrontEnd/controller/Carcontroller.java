package com.CarMaxxFrontEnd.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Carcontroller {
	
	@RequestMapping("/")
	
	 
	   public String printHello() {
	     // model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "home";
	}
	      @RequestMapping("log")
	
	 	 
		   public String login(){ 
		     // model.addAttribute("message", "Hello Spring MVC Framework!");
		      return "log";
		   }
	      @RequestMapping("signin")
	  	
		 	 
		   public String signin(){ 
		     // model.addAttribute("message", "Hello Spring MVC Framework!");
		      return "signin";
		   }
	      @RequestMapping("home")
		  	
		 	 
		   public String home(){ 
		     // model.addAttribute("message", "Hello Spring MVC Framework!");
		      return "home";
		   }
	   }
	
	


