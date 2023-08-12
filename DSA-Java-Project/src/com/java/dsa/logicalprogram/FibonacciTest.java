package com.java.dsa.logicalprogram;

public class FibonacciTest {

	public static void main(String[] args) {
		int n = 10;
		
		int a = 0, b = 1, c;
		
		for(int i=0; i<= n; i++) {
			System.out.print(a + " ");
			
			c = a+b;
			a = b;
			b = c;
		}
	}
	
}
