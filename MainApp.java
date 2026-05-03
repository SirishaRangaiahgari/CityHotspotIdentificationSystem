import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Location;
import service.HotspotService;

public class MainApp {

	public static void main(String[] args) {
		List<Location> locations = Arrays.asList(new Location(12.97,77.59,30),
				new Location(12.98,77.60,80),
				new Location(12.99,77.61,100));
		HotspotService service = new HotspotService();
		List<Location> hotspots = service.findHotspots(locations);
		System.out.println("Hotspot Areas :");
		for(Location loc : hotspots) {
			System.out.println("Lat : "+loc.getlatitude());
			System.out.println("Long : "+loc.getlongitude());
			System.out.println("Crowd : "+loc.getcrowdCount());
		}
	}

}
