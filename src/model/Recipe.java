package model;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeNumberException;

public class Recipe {
	private List<Ingredient> ingredients;
	//CONSTRUCTOR
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	//AÑADIR INGREDIENTES, NOMBRE Y PESO
	public void addIngredient(String n, double w) throws NegativeNumberException{
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	
	
	public void removeIngredient(String n) throws NegativeNumberException{
		
			for(int i=0; i<ingredients.size() ;i++) {
			
				if(ingredients.get(i).getName().equals(n)) {
				
					ingredients.remove(i);				
				}
			}
		
		
	}
	//LISTA DE INGREDIENTES
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}
