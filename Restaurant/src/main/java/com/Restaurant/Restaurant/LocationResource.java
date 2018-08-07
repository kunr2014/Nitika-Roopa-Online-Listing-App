package com.Restaurant.Restaurant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationResource {
	
	
	@Autowired
	Location location;
	String des;
	String uriPath;
	
	//Find Distance
	
	//Find location by id
	@GetMapping(path="/restaurants/location/{id}")
	public  String getAddressResponse() throws IOException {
		
		LocationResource lr=new LocationResource();

		URL url = new URL(lr.getDistance(1));
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		String line, outputString = "";
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(conn.getInputStream()));
		while ((line = reader.readLine()) != null) {
		     outputString += line;
		}
		System.out.println(outputString);
		return outputString;
		
	}
	
	
	//Hardcoded source destination as home address need to change...
	
	public String getDistance(Integer restaurantId) {
	LocationDao loDao=new LocationDao();
	
	if(LocationDao.getLocationMap().containsKey(restaurantId)) {
		
	StringTokenizer st=new StringTokenizer(loDao.getAddress(restaurantId).getAddress(), " ");
	while (st.hasMoreElements()) {
		des = st.nextElement().toString().trim();
		
	}
	System.out.println(des);
     uriPath="https://maps.googleapis.com/maps/api/distancematrix/json?origins=3446+gredell+pl+sanjose+ca&destinations="+des;
	
	}
	return uriPath;
	}
	
	

}