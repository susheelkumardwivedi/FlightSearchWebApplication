package com.nagarro.flightSearching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping(value="/welcome")
	public String hello(Model model){
		return "Welcome";
	}
}
