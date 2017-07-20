package com.restfulwebservice.restfulwebservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeatherData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
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
