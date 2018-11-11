package com.starbuzzcoffee;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println("Beverage ->" + beverage.getDescription() + "-" + beverage.cost() + "$");
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println("Beverage ->" + beverage.getDescription() + "-" + beverage.cost() + "$");
	}
}
