package com.target.adapterpattern;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");

	}

	@Override
	public void fly() {
		System.out.println("Turkey is flying short distance");
	}

}
