package com.revature.weather;

public class Report {
	public static void main (String[] args) {
		System.out.println("Todays Weather Report: ");
		Hurricane Marry = new Hurricane("Marry", 155, "catastrophic", 10.5, 5);
		System.out.println(Marry);
		Marry.layers();
		Marry.sunRadiation();
		Marry.temperature();
		Marry.moisture();
		Marry.airPressure();
		
		System.out.println("Now for some good news.");
		Ozone Aurora = new Ozone();
		Aurora.northernLights();
		System.out.println("Lets watch the Sky Lights.");
	}
}
