package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the highest frequency of character in a string.
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class HighestFrequencyOfCharacter {
	public static void main(String[] args) {
		String str = "HelloWorld";

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		Character mfc = str.charAt(0);
		
		for(Character key : map.keySet()) {
			if(map.get(key)> map.get(mfc)){
				mfc = key;
			}
		}
		
		System.out.println("Highest frequency -: " + mfc);
	}

}
