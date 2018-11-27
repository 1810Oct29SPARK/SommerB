package com.revature.weather;

public class Hurricane extends LowPressure {
	
	private String name;
	private double windSpeed;
	private String damage;
	private double precipitation;
	private int category;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hurricane() {
		super();
	}
	
	public Hurricane(String name, double windSpeed, String damage, double precipitation, int category) {
		this.name = name;
		this.windSpeed = windSpeed;
		this.damage = damage;
		this.precipitation = precipitation;
		this.category = category;
	}
	
	

	@Override
	public void sunRadiation() {
		// TODO Auto-generated method stub
		super.sunRadiation();
	}

	@Override
	public void temperature() {
		// TODO Auto-generated method stub
		super.temperature();
	}

	@Override
	public void moisture() {
		// TODO Auto-generated method stub
		super.moisture();
	}

	@Override
	public void airPressure() {
		// TODO Auto-generated method stub
		super.airPressure();
	}

	@Override
	public void layers() {
		// TODO Auto-generated method stub
		super.layers();
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Hurricane [name=" + name + ", windSpeed=" + windSpeed + ", damage=" + damage + ", precipitation="
				+ precipitation + ", category=" + category + "]";
	}
	
}
