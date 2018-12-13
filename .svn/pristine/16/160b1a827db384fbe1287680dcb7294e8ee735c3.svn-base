package com.nagarro.flightSearching.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class SearchForm {
	@NotEmpty
	@Size(min = 3, max = 3)
	private String destination;
	@NotEmpty
	@Size(min = 3, max = 3)
	private String arrival;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	@NotEmpty
	private String date;
	@NotEmpty
	private String flightClass;
	@NotEmpty
	private String outputPreference;

	public String getOutputPreference() {
		return outputPreference;
	}

	public void setOutputPreference(String outputPreference) {
		this.outputPreference = outputPreference;
	}

}
