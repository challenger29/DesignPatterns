package com.chocoholic;

public class ClassicSingletonChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ClassicSingletonChocolateBoiler boilerInstance;

	private ClassicSingletonChocolateBoiler(){
		empty = true;
		boiled = false;
	}

	public static ClassicSingletonChocolateBoiler getBoilerInstance(){
		if(boilerInstance == null){
			boilerInstance = new ClassicSingletonChocolateBoiler();
		}
		return boilerInstance;
	}

	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
			//fill the boiler with milk/chocolate mixture
		}
	}

	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
		}
	}

	public void boil(){
		if(!isEmpty() && !isBoiled())
			boiled = true;
	}

	private boolean isBoiled() {
		return boiled;
	}

	private boolean isEmpty() {
		return empty;
	}
}
