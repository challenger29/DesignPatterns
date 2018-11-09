package com.design.simulduck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		FlyBehavior flyBehavior = new FlyWithWings();
		super.setFlyBehavior(flyBehavior);
	}
	public void display(){
		System.out.println("Hi im MallardDuck");
	}

}
