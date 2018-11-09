package com.design.simulduck;

public class MainApp {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.fly();
		duck = new RedHeadDuck();
		duck.display();
		duck.fly();
		
		
	}
}
