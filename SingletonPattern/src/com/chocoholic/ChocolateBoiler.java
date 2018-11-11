package com.chocoholic;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	public ChocolateBoiler(){
		empty = true;
		boiled = false;
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
