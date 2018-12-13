package com.nagarro.flightSearching.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.flightSearching.dao.SearchDAO;
import com.nagarro.flightSearching.model.Flight;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDAO searchDAO;

	public void setSearchDAO(SearchDAO searchDAO) {
		this.searchDAO = searchDAO;
	}

	public List<Flight> searchFlights(String destination, String arrival,
			String date, String flightClass) {
		return searchDAO.searchFlights(destination, arrival, date, flightClass);
	}

	public List<Flight> sorting(String outputPreference, List<Flight> result) {
		if(outputPreference.equals("FARE"))
			Collections.sort(result,new ByFare());
		else Collections.sort(result,new ByBoth());

		return result;

	}

}
class ByFare implements Comparator<Flight>{

	public int compare(Flight a, Flight b) {
		
		int returnValue=-1;
		if(b.getFare()<a.getFare())
			returnValue=1;
		return returnValue;
	}
	
}
class ByBoth implements Comparator<Flight>{

	public int compare(Flight a, Flight b) {
		
		int returnValue=-1;
		if(b.getFare()<a.getFare())
			returnValue=1;
		else if(b.getFare()==a.getFare()){
			if(b.getDuration()<a.getDuration())
				returnValue=1;
		}
		return returnValue;
	}
	
}
