package TrainPack;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Station> stations = new ArrayList<Station>(); 
		
		stations.add(new Station("Penn Station"));
		stations.add(new Station("30th Street Station"));
		stations.add(new Station("Richmond Station"));
		stations.add(new Station("Homestead Station"));
		stations.add(new Station("Union Terminal"));
		

		ArrayList<Train> trains = new ArrayList<Train>(); 
		
		trains.add(new Train("B45"));
		trains.add(new Train("C42"));
		trains.add(new Train("B23"));
		trains.add(new Train("B35"));
		trains.add(new Train("A15"));
		trains.add(new Train("D35"));
		
		trains.get(0).AddStop(stations.get(0), "A1", LocalTime.of(7, 05));
		trains.get(0).AddStop(stations.get(2), "B2", LocalTime.of(8, 45));
		trains.get(0).AddStop(stations.get(4), "A2", LocalTime.of(9, 15));
		
		trains.get(1).AddStop(stations.get(1), "B3", LocalTime.of(6, 05));
		trains.get(1).AddStop(stations.get(3), "C1", LocalTime.of(8, 25));
		trains.get(1).AddStop(stations.get(4), "A1", LocalTime.of(14, 55));
		
		trains.get(2).AddStop(stations.get(0), "A3", LocalTime.of(11, 05));
		trains.get(2).AddStop(stations.get(1), "B3", LocalTime.of(13, 05));
		trains.get(2).AddStop(stations.get(2), "A2", LocalTime.of(14, 25));
		trains.get(2).AddStop(stations.get(3), "A1", LocalTime.of(15, 00));
		trains.get(2).AddStop(stations.get(4), "B1", LocalTime.of(16, 55));
		trains.get(2).AddStop(stations.get(3), "A4", LocalTime.of(18, 45));

		trains.get(3).AddStop(stations.get(0), "A2", LocalTime.of(1, 05));
		trains.get(3).AddStop(stations.get(1), "B1", LocalTime.of(3, 05));
		trains.get(3).AddStop(stations.get(2), "A4", LocalTime.of(4, 25));
		trains.get(3).AddStop(stations.get(3), "A5", LocalTime.of(5, 00));
		trains.get(3).AddStop(stations.get(2), "B4", LocalTime.of(6, 55));

		trains.get(4).AddStop(stations.get(3), "A3", LocalTime.of(11, 05));
		trains.get(4).AddStop(stations.get(2), "B3", LocalTime.of(13, 05));
		trains.get(4).AddStop(stations.get(1), "A2", LocalTime.of(14, 25));
		trains.get(4).AddStop(stations.get(0), "A1", LocalTime.of(15, 00));
		trains.get(4).AddStop(stations.get(1), "B1", LocalTime.of(16, 55));
		trains.get(4).AddStop(stations.get(2), "A4", LocalTime.of(18, 45));
		
		@SuppressWarnings("unused")
		Timetable trainSchedule = new Timetable(stations, trains);
		
		for(Stop stop:stations.get(1).GetStops()) {
			System.out.print(stop.station.stationName + " " + stop.train.trainName + " ");
			System.out.println(stop.time.toString());
		}
		
		for(Stop stop:stations.get(2).GetStops()) {
			System.out.print(stop.station.stationName + " " + stop.train.trainName + " ");
			System.out.println(stop.time.toString());
		}

		for(Stop stop:stations.get(0).GetStops()) {
			System.out.print(stop.station.stationName + " " + stop.train.trainName + " ");
			System.out.println(stop.time.toString());
		}
	}

}
