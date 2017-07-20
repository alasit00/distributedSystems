package com.restclient.restclient;

public class WeatherData {
	
	private String cityname;
	private double temperature;
	private int pressure;
	private int humidity;
	
	protected WeatherData() {}
	
	public WeatherData(String cityname, double temperature, int pressure, int humidity) {
		this.cityname = cityname;
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	
}
