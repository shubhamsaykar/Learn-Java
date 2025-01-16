package com.shubham.binarySearch;


public class FloorElementInArray {
	
	
	public static void main(String[] args) {
		System.out.println(
				"Element found at index which is Smaller than equal to  :" + searchSmallerElement(2) + "\n");
	}
	
	
//	find the floor element in an array which is Smaller than equal to target
	public static int searchSmallerElement(int target) {

		int arr[] = { 3, 5, 6, 7, 8, 10, 13, 16 };

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

		 return end >= 0 ? arr[end] : -1;

	}

}
