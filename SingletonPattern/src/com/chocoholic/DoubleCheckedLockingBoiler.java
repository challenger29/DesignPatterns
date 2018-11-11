package com.chocoholic;

public class DoubleCheckedLockingBoiler {

	private boolean empty;
	private boolean boiled;
	private static DoubleCheckedLockingBoiler  boilerInstance;

	private DoubleCheckedLockingBoiler(){
		empty = true;
		boiled = false;
	}

	public static DoubleCheckedLockingBoiler getBoilerInstance(){
		if(boilerInstance == null){
			synchronized (DoubleCheckedLockingBoiler.class){
				if(boilerInstance == null){
					boilerInstance = new DoubleCheckedLockingBoiler();
				}
			}
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
