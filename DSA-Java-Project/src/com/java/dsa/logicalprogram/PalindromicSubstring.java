package com.java.dsa.logicalprogram;

/**
 * Find Palindrome substring of a string.
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class PalindromicSubstring {

	public static void main(String[] args) {
		String str = "helloworld";
		palindromeSubstrings(str);
	}
	
	public static void palindromeSubstrings(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				String ss = str.substring(i, j);
				if(isPalindrome(ss)== true) {
					System.out.println(ss);
				}
			}
		}
	}

	private static boolean isPalindrome(String ss) {
		int len = ss.length();
		for(int i=0; i<len/2; i++) {
			if(ss.charAt(i) != ss.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
}
