package de.edlich.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator();
	}

	@Test
	void testAdd() {
		assertEquals(42, c.add(40, 2));
	}
	
/* 	@Test(expected=Exception.class) # JUnit4
	void testAddMe() {
		assertEquals(42, c.div(40, 0));
	} */
	
	@Test
	void testDiv() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {c.div(42, 0);});}
}
