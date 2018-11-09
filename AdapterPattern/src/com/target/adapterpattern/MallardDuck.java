package com.target.adapterpattern;

public class MallardDuck implements Duck {
	public void display(){
		System.out.println("Hi im MallardDuck");
	}
	@Override
	public void fly() {
		System.out.println("I can fly lonngg!");
	}
	@Override
	public void quack() {
			System.out.println("I can quack");
	}

}
