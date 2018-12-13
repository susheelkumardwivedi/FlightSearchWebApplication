package com.nagarro.flightSearching.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.nagarro.flightSearching.model.Flight;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO {
	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<Flight> searchFlights(String destination, String arrival,
			String date, String flightClass) {
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		// Query using Hibernate Query Language
		String SQL_QUERY = " from Flight as f where f.destination=? and f.arrival=? and f.date=? and f.flightClass=? and f.availability=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, destination);
		query.setParameter(1, arrival);
		query.setParameter(2, date);
		query.setParameter(3, flightClass);
		query.setParameter(4, "Y");
		List list = new LinkedList();
		if(!flightClass.equals("EB"))
			list = query.list();
			else{
				List temp=new LinkedList();
				query.setParameter(3,"E");
				temp=query.list();
				list.addAll(temp);
				query.setParameter(3,"B");
				temp=query.list();
				list.addAll(temp);
				query.setParameter(3,"EB");
				temp=query.list();
				list.addAll(temp);
				
				
				
			}

		

		session.close();
		return list;
	}

}
