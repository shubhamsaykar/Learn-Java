package com.shubham.binarySearch;

public class SearchInInfiniteArray {
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(
				"Search in infinite array withou using array length:::" + searchInInfinateArray(arr, 6) + "\n");
	}
	
	
	private static int searchInInfinateArray(int arr[], int target) {

		int start = 0;
		int end = 1;
		while (target > arr[end]) {
			int tempStart = end + 1;

			end = end + (end - start + 1) * 2;
			start = tempStart;
		}

		return binarySearchWithoutLength(arr, target, start, end);
	}

	private static int binarySearchWithoutLength(int arr[], int target, int start, int end) {

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}

		return -1;

	}

}
