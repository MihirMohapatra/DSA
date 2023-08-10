package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Find the occurrence Of character
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class OccurrenceOfCharacter {

	public static void main(String[] args) {

		String str = "hello World";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				
				//Removing duplicate character
				//map.remove(ch);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
	}

}
