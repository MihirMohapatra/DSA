package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;

/**
 * Given array {5, 2, 4} and target is 6 the two sum problem answer is [2,4]
 * 
 * @author MIHIR MOHAPATRA
 *
 */
public class TwoSumProblem {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4 };

		int[] twoSum = twoSum(arr, 6);

		System.out.println(twoSum[0] + " and " + twoSum[1]);
	}

	public static int[] twoSum(int[] nums, int target) {

//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i=0; i< nums.length; i++) {
//			Integer indexMap = map.get(nums[i]);
//			
//			if(indexMap != null) {
//				return new int[] {i, indexMap};
//			}
//			
//			map.put(target - nums[i], i);
//		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}

		return nums;
	}

//	As we iterate through the array, for each element nums[i], 
//	we calculate the complement (the number that, when added to nums[i], equals the target). 
//	If the complement exists in the HashMap, we have found the two numbers that add up to the target, 
//	and we return their indices. If not, we add the current number to the HashMap along with its index.
}
