package com.java.dsa.logicalprogram;

public class PlaindromeExample {
	public static void main(String[] args) {

		// Given String is Palindrome or not
		String str = "aba1";
		System.out.println(isPalindrome(str));
		
		
	}
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		
		for(int i=0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
