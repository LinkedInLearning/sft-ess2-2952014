package de.edlich.mdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class KankenkasseTest {
	Krankenkasse k;

	@Test
	void testCalcBeitrag() {
		Gehaltsrechner g = mock(Gehaltsrechner.class); 
		
		when(g.calcNetto(10000)).thenReturn(5000);
		
		k = new Krankenkasse(g);
		
		assertEquals(1000, k.calcBeitrag(10000));
	}
}
