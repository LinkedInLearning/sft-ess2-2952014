package de.edlich.mydemo;

public class Math {
	public int doubleMe(int a) {
		return 2*a;
	}
	
	public boolean isEven(int a) {
		if (a % 2 == 0)
			return true;
		else
			return false;
	}
}
