package com.design.simulduck;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		FlyBehavior flyBehavior = new FlyNoWay();
		super.setFlyBehavior(flyBehavior);
	}
	public void display(){
		System.out.println("Hi im RedHeadDuck");
	}

}
