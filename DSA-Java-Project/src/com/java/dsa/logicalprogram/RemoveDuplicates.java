package com.java.dsa.logicalprogram;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Remove duplicates from string.
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "Hello world ";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(Character ch : str.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Character ch: set) {
			sb.append(ch);
		}
		
		String newString = sb.toString();
		System.out.println(newString);
	}
}
