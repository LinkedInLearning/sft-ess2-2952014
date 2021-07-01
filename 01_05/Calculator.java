package de.edlich.test;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int div(int a, int b) {
		if(b==0)
			throw new IllegalArgumentException("Division by zero!");
		return a/b;
	}
}
