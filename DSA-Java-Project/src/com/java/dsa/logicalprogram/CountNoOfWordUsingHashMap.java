package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;

/**
 * Count number of word using HashMap
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class CountNoOfWordUsingHashMap {
	
	public static void main(String[] args) {
		String str = "this is this is a done by mihir mihir";
		
		String[] words = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else {
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
