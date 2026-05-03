package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dao.LocationDAO;
import model.Location;

public class HotspotService {
 
			  LocationDAO dao = new LocationDAO();
			     public void addLocation(Location loc) {
			    	 dao.saveLocation(loc);
			     }
			     public List<Location> findHotspots(List<Location> locations){
			    	 return locations.stream().filter(loc -> loc.getcrowdCount() > 50).collect(Collectors.toList());
			   
			     }
		  }

