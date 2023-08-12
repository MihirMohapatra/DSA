package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if duplicates contains in an array 
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class ContainsDuplicates {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 2, 5};
		
		boolean duplicatesContains = isDuplicatesContains(arr);
		System.out.println(duplicatesContains);
		
		
	}

	private static boolean isDuplicatesContains(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer num : arr) {
			if(map.containsKey(num)) {
				return true;
			}else {
				map.put(num, 1);
			}
		}
		
		return false;
	}
	
	

}
