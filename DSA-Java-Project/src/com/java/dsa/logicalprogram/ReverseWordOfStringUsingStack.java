package com.java.dsa.logicalprogram;

import java.util.Stack;

/**
 * Reverse words of string using stack
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class ReverseWordOfStringUsingStack {

	public static void main(String[] args) {

		String str = "Hello Mihir are you OK!";
		
		String[] words = str.split(" ");
		
		Stack<String> stack = new Stack<String>();
		
		for(String word : words) {
			stack.push(word);
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		
		System.out.println(sb.toString());
		
		
	}

}
