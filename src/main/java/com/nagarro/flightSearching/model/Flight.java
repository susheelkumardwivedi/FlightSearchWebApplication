package com.nagarro.flightSearching.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
@SuppressWarnings("serial")
public class Flight implements Serializable {

	@Id
	@Column(name = "flight_id", length = 11)
	private String id;

	@Column(name = "destination")
	String destination;

	@Column(name = "arrival")
	String arrival;

	@Column(name = "date")
	String date;

	@Column(name = "time")
	int time;
	
	@Column(name = "duration")
	double duration;
	
	@Column(name = "fare")
	int fare;
	
	@Column(name = "availability")
	String availability;
	
	@Column(name = "flight_class")
	String flightClass;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	
}