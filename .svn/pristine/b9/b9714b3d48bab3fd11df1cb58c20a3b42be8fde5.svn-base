package com.nagarro.flightSearching.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.nagarro.flightSearching.model.Flight;

@Repository("addingFlightsDAO")
public class AddingFlightsDAOImpl implements AddingFlightsDAO {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public void addFlight(String id, String destination, String arrival,
			String date, int time, double duration, int fare,
			String availability, String flightClass) {
		Session session=sessionFactory.openSession(); 
		 Transaction t=session.beginTransaction();
		Flight flight=new Flight();
		flight.setDestination(destination);
		flight.setArrival(arrival);
		flight.setDate(date);
		flight.setTime(time);
		flight.setFare(fare);
		flight.setDuration(duration);
		flight.setId(id);
		flight.setFlightClass(flightClass);
		flight.setAvailability(availability);
		session.persist(flight);
		t.commit();
		session.close();
		//System.out.println(flight.getId());
		

	}
	public void clean(){
		Session session=sessionFactory.openSession();
		session.createQuery("delete from Flight").executeUpdate();
		session.close();
	}

}
