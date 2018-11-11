package com.hometheater;

public class HomeTheaterFacade {
	Amplifier amp;
	TheaterLights lights;
	Projector projector;
	Screen screen;
	public HomeTheaterFacade(Amplifier amp, TheaterLights lights, Projector projector, Screen screen) {
		super();
		this.amp = amp;
		this.lights = lights;
		this.projector = projector;
		this.screen = screen;
	}
	public void watchMovie(){
		System.out.println("Get ready to watch movie");
		lights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd();
		
	}
	//similarly endMovie
	//amp.off()
	//projector.off()
}
