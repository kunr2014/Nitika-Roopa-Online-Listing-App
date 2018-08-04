package com.Restaurant.Restaurant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationResource {
	@Autowired
	Location location;
	
	public static void main(String[] args) throws IOException {
		
		//URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=Vancouver+BC|Seattle&destinations=San+Francisco|Victoria+BC");
		
		URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=3446+gredell+pl+sanjose+ca&destinations=San+Francisco");
		
		
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		String line, outputString = "";
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(conn.getInputStream()));
		while ((line = reader.readLine()) != null) {
		     outputString += line;
		}
		System.out.println(outputString);
		
	}
	
/*	public void getDistance(LocationDao location) {
		
	String uriPath="https://maps.googleapis.com/maps/api/distancematrix/json?origins=3446+gredell+pl+sanjose&destinations";
	}*/
	
	

}
