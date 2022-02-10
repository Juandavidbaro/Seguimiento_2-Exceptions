package model;

import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	//CONSTRUCTOR
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	//AÑADIR PESO
	public void addWeight(double additionalW) throws NegativeNumberException {
		
		if (additionalW<0) {
			throw new NegativeNumberException(additionalW);
		}else {
			weight = weight + additionalW;
		}	
		
	}
	
	//DISMINUIR PESO
	public void removeWeight(double decreaseW)throws NegativeNumberException {
		
		if (decreaseW<0) {
			throw new NegativeNumberException(decreaseW);
		}else {
			weight = weight - decreaseW;
		}	
		
	}
}
