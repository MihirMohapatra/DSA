package com.java.dsa.logicalprogram;

public class PrimeNumberTest {

	public static void main(String[] args) {
		System.out.println(extracted(7));
	}

	
	private static boolean extracted(int num) {
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}else {
			for(int i=2; i<= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}
