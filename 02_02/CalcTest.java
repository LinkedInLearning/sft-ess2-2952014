package de.edlich.mydemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	Calc c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calc();
	}

	@Test
	void testAdd() {
		assertEquals(42, c.add(40, 2));
	}

	@Test
	void testSub() {
		assertEquals(42, c.sub(44, 2));
	}

	@Test
	void testMult() {
		assertEquals(42, c.mult(21, 2));
	}
}
