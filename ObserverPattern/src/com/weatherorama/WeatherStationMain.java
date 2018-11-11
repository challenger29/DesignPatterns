package com.weatherorama;

public class WeatherStationMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 20, 65.5f);
		weatherData.setMeasurements(60, 23, 34.5f);
	}
}
