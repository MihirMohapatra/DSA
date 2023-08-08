package com.java.dsa.logicalprogram;

/**
 * Reverse the string using multiple way.
 * @author MIHIR MOHAPATRA
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		String str = "this is a java dsa project";
		
		String revString = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
		
		
		// Using String builder.
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
		
		//Using java8,
		
		String revString1 = new StringBuilder(str).reverse().toString();
		System.out.println(revString1);
		
	}
}
