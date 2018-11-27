package com.revature.weather;

public class HighPressure extends Systems {

	public HighPressure() {
		System.out.println("High Pressure being called");
	}
	
	@Override
	public void sunRadiation() {
		super.sunRadiation();
		System.out.println("Low");
	}

	@Override
	public void temperature() {
		super.temperature();
		System.out.println("High");
	}

	@Override
	public void moisture() {
		super.moisture();
		System.out.println("High");
	}

	@Override
	public void airPressure() {
		super.airPressure();
		System.out.println("Low");
	}
	
}
