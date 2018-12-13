package com.nagarro.flightSearching.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flightSearching.form.SearchForm;
import com.nagarro.flightSearching.model.Flight;
import com.nagarro.flightSearching.service.SearchService;

@Controller
@RequestMapping(value = "flightsearch")
public class SearchController {
	@Autowired
	public SearchService searchService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {

		SearchForm searchForm = new SearchForm();
		model.put("searchForm", searchForm);
		return "flightsearch";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processForm(@Valid SearchForm searchForm,
			BindingResult result, Map model) {

		List<Flight> searchresult = searchService.searchFlights(
				searchForm.getDestination(), searchForm.getArrival(),
				searchForm.getDate(), searchForm.getFlightClass());
		
		List<Flight> sortedSearchresult=searchService.sorting(searchForm.getOutputPreference(),searchresult);
		 ModelAndView map = new ModelAndView("flightsearch");
		    map.addObject("lists",sortedSearchresult);

		    return map;

	}
}
