package com.nagarro.flightSearching.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.flightSearching.constants.Constants;
import com.nagarro.flightSearching.dao.AddingFlightsDAO;

@Service("addFlightsService")
public class AddFlightsServiceImpl implements AddFlightsService {

	@Autowired
	private AddingFlightsDAO addingFlightsDAO;

	public void setAddingFlightsDAO(AddingFlightsDAO addingFlightsDAO) {
		this.addingFlightsDAO = addingFlightsDAO;
	}

	public void addFlights() {
		
		addingFlightsDAO.clean();

		File folder = new File(Constants.address.substring(0,
				Constants.address.length() - 1));
		for (final File fileEntry : folder.listFiles()) {
			System.out.println(fileEntry.getName());

			addFlightsOfAirline(fileEntry.getName());

		}
		// addingFlightsDAO.addFlights();
	}
	
	private void addFlightsOfAirline(String airline) {
		BufferedReader br = null;
		String line = "";
		String csvFile=Constants.address+airline;
		try {

			br = new BufferedReader(new FileReader(csvFile));
			int i = 0;
			while ((line = br.readLine()) != null) {
				if(i!=0){
					
					String[] flight=line.split("\\|");
					if(flight.length==9){
					System.out.println(line);
//					System.out.println(flight[0]+" "+flight[1]+" "+flight[2]+" "+flight[3]+" "+flight[4]+" "+flight[5]+" "+flight[6]+" "+flight[7]+" "+flight[8]);
					String id=flight[0];
					String destination=flight[1];
					String arrival=flight[2];
					String date=flight[3];
					int time=Integer.parseInt(flight[4]);
					double duration=Double.parseDouble(flight[5]);
					int fare=Integer.parseInt(flight[6]);
					String availability=flight[7];
					String flightClass=flight[8];
					addingFlightsDAO.addFlight(id,destination,arrival,date,time,duration,fare,availability,flightClass);
					}
					
					
					
				}
				i++;
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
