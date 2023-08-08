package com.java.dsa.logicalprogram;

import java.util.Arrays;

/**
 * Given Strings are Anagram or not.
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class AnagramString {

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Care";

		isAnagram(str1, str2);
	}

	private static void isAnagram(String str1, String str2) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// both string length should be equal.
		if (str1.length() == str2.length()) {

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean isAnagram = Arrays.equals(ch1, ch2);

			if (isAnagram) {
				System.out.println("Those are Anagram Strings");
			} else {
				System.out.println("Those are not Anagram strings");
			}
		}
		else {
			System.out.println("Those are not Anagram strings");
		}
	}
}
