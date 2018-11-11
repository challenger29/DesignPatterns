package com.hometheater;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		TheaterLights light = new TheaterLights();
		Projector projector = new Projector();
		Screen screen = new Screen();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, light, projector, screen);
		homeTheater.watchMovie();
		//homeTheater.endMovie();
	}
}
