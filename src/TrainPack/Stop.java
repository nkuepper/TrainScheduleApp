package TrainPack;

import java.time.*;

public class Stop implements Comparable<Stop> {

	public Train train;
	public Station station;
	public String platform;
	public LocalTime time;
	
	public Stop(Train train, Station station, String platform, LocalTime time) {
		
		this.train = train;
		this.station = station;
		this.platform = platform;
		this.time = time;
		
	}

	@Override
	public int compareTo(Stop o) {

		return this.time.compareTo(o.time);
		
	}

}
