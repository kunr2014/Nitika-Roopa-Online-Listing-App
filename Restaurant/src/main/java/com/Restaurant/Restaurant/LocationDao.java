package com.Restaurant.Restaurant;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;



@Component
public class LocationDao {
	
	private static Map<Integer, Location> locationMap=new HashMap<>();
	
	static {
		
		locationMap.put(1, new Location("Lawrence expy santaclara", 95051));
		locationMap.put(2, new Location(" Great mall Dr Millipitas", 95035));
		locationMap.put(3, new Location("E Duan Ave Sunnyvale", 94085));
		locationMap.put(4, new Location("2980 E Capitol Expy #10 San Jose ", 95148));
		
		
	}
	
	public Location getAddress(Integer restaurantId) {
		
		if(locationMap.containsKey(restaurantId)){

		for(Map.Entry<Integer, Location> entry:locationMap.entrySet()) {
			return entry.getValue();
		}
	}
		return null;
	
	}

	public static Map<Integer, Location> getLocationMap() {
		return locationMap;
	}

	public static void setLocationMap(Map<Integer, Location> locationMap) {
		LocationDao.locationMap = locationMap;
	}
}
