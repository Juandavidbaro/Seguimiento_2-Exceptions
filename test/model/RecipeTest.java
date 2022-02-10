package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;



class RecipeTest {

	private Recipe recipe1;
	
	private void setupStage1 () {
		recipe1 = new Recipe();
	}
	public void setupStage2 () throws NegativeNumberException {
		
		recipe1 = new Recipe();
		recipe1.addIngredient("Cebolla", 315);
		
		recipe1.addIngredient("Ajo", 58);
		
		recipe1.addIngredient("Arroz",520);
	}
	@Test
	void addIngredientTest1() throws NegativeNumberException{
		setupStage1();
		
		recipe1.addIngredient("Sal",12);	
		assertEquals(1,  recipe1.getIngredients().size());	
		
	}
	
	@Test
	void addIngredientTest2() throws NegativeNumberException{
		setupStage2();
		
		recipe1.addIngredient("Pimienta",6);	
		assertEquals(4,  recipe1.getIngredients().size());	
		
	}
	
	@Test
	void addIngredientTest3() throws NegativeNumberException{
		setupStage2();
		
		recipe1.addIngredient("Ajo",21);
		assertNotNull(recipe1);
		assertEquals(3,  recipe1.getIngredients().size());
		assertEquals("Ajo",recipe1.getIngredients().get(1).getName());
		assertEquals(79,recipe1.getIngredients().get(1).getWeight());
		
	}
	
	@Test
	void removeIngredientTest3() throws NegativeNumberException{
		setupStage2();
		
		recipe1.removeIngredient("Ajo");	
		assertEquals(2,  recipe1.getIngredients().size());
		assertEquals("Cebolla",recipe1.getIngredients().get(0).getName());
		assertEquals("Arroz",recipe1.getIngredients().get(1).getName());
	}
}
