package com.java.dsa.logicalprogram;

/**
 *  Find all the substring of a string
 * @author MIHIR MOHAPATRA
 *
 */
public class SubstringExample {

	public static void main(String[] args) {
		String str = "Helloworld";
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				System.out.println( str.substring(i, j));
			}
		}
	}
}
