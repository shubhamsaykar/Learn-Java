package com.shubham.binarySearch;

import java.util.Arrays;

public class SearchInRange {

	public static void main(String[] args) {
		int[] ans = searchRange(8);
		System.out.println("Element found at start index and end index   :" + Arrays.toString(ans) + "\n");
	}
	
	
	public static int[] searchRange(int target) {

		int arr[] = { 5, 7, 7, 8, 8, 10 };
		int a[] = { -1, -1 };
		if (arr.length <= 0) {

			return a;
		}

		int x = binarySearchAlgorith(arr, target, true);
		int y = binarySearchAlgorith(arr, target, false);
		
		a[0] = x;
		a[1] = y;
		return a;

	}

	public static int binarySearchAlgorith(int arr[], int target, boolean startIndex) {

		int ans = -1;
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (startIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;

	}
}
