package TrainPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Timetable {

	public ArrayList<Station> stations; // Sort by name
	public ArrayList<Train> trains; // Sort by departure time and station name
	
	public Timetable(ArrayList<Station> stations, ArrayList<Train> trains) {
		
		this.stations = stations;
		this.trains = trains;
		
		// Sort stations
		Collections.sort(stations);
		
		// Sort trains
		CompareTrains compare = new CompareTrains();
		Collections.sort(trains, compare);		
		
	}

}

class CompareTrains implements Comparator<Train>
{
	public int compare(Train t1, Train t2) {
		
		if (t1.trainName.equals(t2.trainName)) {
			
			// Sort by departure time
			return t1.stops.get(0).time.compareTo(t2.stops.get(0).time);
			
		}
		else {
			
			// Sort by name
			return t1.trainName.compareTo(t2.trainName);
			
		}
		
	}
}