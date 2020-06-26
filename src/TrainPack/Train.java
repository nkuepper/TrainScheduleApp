package TrainPack;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;

public class Train implements Comparable<Train> {

	public String trainName;
	public ArrayList<Stop> stops = new ArrayList<Stop>(); // needs to be sorted by time
	
	public Train(String trainName) {
		
		this.trainName = trainName;
		
	}
	
	public void AddStop(Station station, String platform, LocalTime time) {
		
		Stop newStop = new Stop(this, station, platform, time);
		
		// Add stop to station and train collections
		station.stops.add(newStop);
		stops.add(newStop);
		
	}

	public Stop GetFirst() {
		
		Collections.sort(stops);
		return stops.get(0); // first
		
	}
	
	public Stop GetLast() {

		Collections.sort(stops);
		return stops.get((stops.size() - 1)); // last
		
	}
	
	@SuppressWarnings("null")
	public ArrayList<Stop> GetStops(String stationName) {

		Collections.sort(stops);
		ArrayList<Stop> newStops = null;
		
		
		for(int i = 0; i < stops.size(); i++) {
			
			if (stops.get(i).station.stationName.equals(stationName)) {
				
				for(int j = i + 1; j < stops.size(); j++) {
					
					newStops.add(stops.get(j));
					
				}
				
			}
			
		}
		
		return newStops; // Get stops after certain station
		
	}
	
	public String ToString() {
		return this.trainName;
	}

	@Override
	public int compareTo(Train o) {
		
		if (this.trainName.equals(o.trainName)) {
			
			// Sort by departure time
			return this.stops.get(0).time.compareTo(o.stops.get(0).time);
			
		}
		else {
			
			// Sort by name
			return this.trainName.compareTo(o.trainName);
			
		}
		
	}

}
