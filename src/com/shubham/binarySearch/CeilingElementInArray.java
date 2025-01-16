package com.shubham.binarySearch;

public class CeilingElementInArray {

	
	public static void main(String[] args) {
		System.out.println(
				"Element found at index which is greater than equal to  :" + searchGreaterElement(9) + "\n");
	}
	
	
//	find the ceiling element in an array which is greater than equal to target

	public static int searchGreaterElement(int target) {

		int arr[] = { 3, 5, 6, 7, 8, 10, 13, 16 };

		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return arr[mid];
			}

			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[start];

	}
}
