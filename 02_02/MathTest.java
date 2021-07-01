package de.edlich.mydemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathTest {
	Math m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Math();
	}

	@Test
	void testDoubleMe() {
		assertEquals(42, m.doubleMe(21));
	}

	@Test
	void testIsEven() {
		assertEquals(true, m.isEven(42));
	}

}
