package com.nagarro.flightSearching.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.flightSearching.form.LoginForm;
import com.nagarro.flightSearching.form.SearchForm;
import com.nagarro.flightSearching.service.AddFlightsService;
import com.nagarro.flightSearching.service.LoginService;

@Controller
@RequestMapping(value="loginform")
public class LoginController {

	
	@Autowired
	public LoginService loginService;
	
	@Autowired
	public AddFlightsService addFlightsService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		
	addFlightsService.addFlights();
		LoginForm loginForm = new LoginForm();
		model.put("loginForm1", loginForm);
		return "loginform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			Map model) {

		
		if (result.hasErrors()) {
			return "loginform";
		}
		
		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginform";
		}
		*/
		boolean userExists = loginService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
		if(userExists){
			SearchForm searchForm=new SearchForm();
			model.put("searchForm",searchForm);
			return "flightsearch";
		}else{
			//result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}

}

