package com.shubham.binarySearch;

public class SingleNonDuplicateElementInArray {
	
	
	public static void main(String[] args) {
		System.out.println("Non duplicate number in array is = " + singleNonDuplicate() + "\n");
	}
	
	private static int singleNonDuplicate() {
		int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 8, 8 };
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (mid % 2 == 1) {
				mid--;
			}
			if (arr[mid] == arr[mid + 1]) {
				start = mid + 2;
			} else {
				end = mid;
			}
		}

		return arr[start];
	}

}
