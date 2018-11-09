package com.target.adapterpattern;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		TurkeyAdapter ta = new TurkeyAdapter(turkey);
		
		System.out.println("Duck says:");
		testDuck(duck);
		System.out.println("Turkey says");
		testDuck(ta);
	}
	public static void testDuck(Duck duck){
		duck.fly();
		duck.quack();
	}
}
