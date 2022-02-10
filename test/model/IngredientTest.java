package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;


class IngredientTest {
	
	private Ingredient ingredient1;

	public void setupStage1 () {
		ingredient1 = new Ingredient("Tomate", 245);	
		
	}
	@Test
	public void addWeightTest() {
		
		setupStage1();
		
		try {
			ingredient1.addWeight(54);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		
		assertTrue(ingredient1.getWeight()==299);		
		
	}
	@Test
	public void addWeightTest2() {
		
		setupStage1();
		
		try {
			ingredient1.addWeight(-100);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(ingredient1.getWeight(),245);
	}
	
	@Test
	public void removeWeightTest() {
		setupStage1();
		
		try {
			ingredient1.removeWeight(45);
		}catch(NegativeNumberException e){
			e.printStackTrace();
		}		
		assertEquals(ingredient1.getWeight(),200);
				
	}
	
	@Test
	public void removeWeightTest2() {
		setupStage1();
		
		try {
			ingredient1.removeWeight(-100);
		}catch(NegativeNumberException e){
			e.printStackTrace();
		}		
		assertEquals(ingredient1.getWeight(),245);
				
	}

}
