package test;

import function.EatFunction;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;




public class TestAcceptableToEat {

	EatFunction t;
	@Before
	public void init() {
		t = new EatFunction();
	}
	
	@Test
	public void testNegativeCarbs() {
		assertFalse(t.acceptableToEat(-5, 10, 10));
		assertFalse(t.acceptableToEat(-1, 10, 10));
	}
	
	@Test
	public void testNegativeProteins() {
		assertFalse(t.acceptableToEat(10, -5, 10));
		assertFalse(t.acceptableToEat(10, -1, 10));
	}
	
	@Test
	public void testNegativeFat() {	
		assertFalse(t.acceptableToEat(10, 10, -5));
		assertFalse(t.acceptableToEat(10, 10, -1));
	}
	
	
	@Test
	public void testNotAcceptableBecauseOfFatRatio() {
		
		assertFalse(t.acceptableToEat(10,10,50));
	}
	
	@Test
	public void testNotAcceptableBecauseOfCalories() {
		
		assertFalse(t.acceptableToEat(100, 100, 30));
	}
	
	
	@Test
	public void testNotAcceptableBecauseOfCaloriesAndFatRatio() {
		
		assertFalse(t.acceptableToEat(2000, 2000, 5000));
	}
	
	@Test
	public void testAcceptable() {
		
		assertTrue(t.acceptableToEat(10, 10, 5));
	}
	
}
