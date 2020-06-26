package TrainPack;

import java.util.ArrayList;
import java.util.Collections;

public class Station implements Comparable<Station> {

	public String stationName;
	public ArrayList<Stop> stops = new ArrayList<Stop>(); // sort by time and platform
	
	public Station(String stationName) {
		
		this.stationName = stationName;
		
	}
	
	public ArrayList<Stop> GetStops() {
		
		return stops;
	
	}
	
	public ArrayList<Train> GetTrains() {
		
		ArrayList<Train> myTrains = new ArrayList<Train>(); 
		
		// Get trains from stops
		for (Stop stop:stops) {
			
			myTrains.add(stop.train);
			
		}
		
		// Sort based on departure time and station name before returning
		Collections.sort(myTrains);
		
		
		return myTrains;
		
	}

	public String ToString() {
		return this.stationName;
	}
	
	@Override
	public int compareTo(Station o) {

		return this.stationName.compareTo(o.stationName);
		
	}
}
