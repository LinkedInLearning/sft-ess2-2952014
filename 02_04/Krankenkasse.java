package de.edlich.mdemo;

public class Krankenkasse {

	Gehaltsrechner g;

	public Krankenkasse(Gehaltsrechner g) { 
		this.g = g;
	}
	// Prinzip Dependency Injecton
	// geht auch mit Setter!

	public int calcBeitrag(int aBrutto) {
		int netto = g.calcNetto(aBrutto);
		return netto / 5;
	}
}
