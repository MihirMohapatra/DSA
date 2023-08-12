package com.java.dsa.logicalprogram.binarysearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int target = 8;
		
		int binarySearch = binarySearch(arr, target);
		
		System.out.println(binarySearch);
		System.out.println(arr[binarySearch]);
	}

	private static int binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length -1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				left = mid +1;
			}else {
				right = mid -1;
			}
		}
		
		return -1;
	}
	
}
