package com.shubham.binarySearch;

public class MountainArray {
	
	
	public static void main(String[] args) {
		int mountainArr[] = { 1, 3, 4, 5, 7, 6, 2 };
		System.out.println("The peack element index of element in mountain array is::"
				+ peakIndexInMountainArray(mountainArr) + "\n");

		int mountainArray[] = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 2;
		System.out.println("Element " + target + " in mountain array found at index :::"
				+ searchTargetInMountainArray(mountainArray, target) + "\n");
	}
	
//	https://leetcode.com/problems/peak-index-in-a-mountain-array/
	public static int peakIndexInMountainArray(int arr[]) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
//				you are in decreasing part of array
//				this may be the an but look at left part

				end = mid; // this is why end != mid - 1
			} else {
//				you are in acsending part of array

				start = mid + 1; // because we know that mid + 1 element > mid element
			}
		}
//		in the ending start == end and pointing to the largest number becuase of above two condition 
//		start and end are always trying to find max element in the above 2 checks
//		hence, when they are pointing to just one element, that is the max one becuase that is the checks says
//		At every point of time for start and end, they have the best posible answer and if we are saying that only one item is remaining
//		hence, cuz of above line that is best possible ans
		return start; // we can return start or end because they are same
	}

//	search in mountain array/ bitonic array
//	https://leetcode.com/problems/find-in-mountain-array/description/
	public static int searchTargetInMountainArray(int arr[], int target) {

		int peakElementIndex = peakIndexInMountainArray(arr);

		int firstTry = simpleBinarySearch(arr, target, 0, peakElementIndex);
		if (firstTry != -1) {
			return firstTry;
		}

		return simpleBinarySearch(arr, target, peakElementIndex + 1, arr.length - 1);

	}

	public static int simpleBinarySearch(int arr[], int target, int start, int end) {

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
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
