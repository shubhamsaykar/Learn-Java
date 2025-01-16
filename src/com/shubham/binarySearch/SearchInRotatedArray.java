package com.shubham.binarySearch;

public class SearchInRotatedArray {
	
	public static void main(String[] args) {
		int rotatedArr[] = { 2, 2, 6, 7, 0, 1, 2 };
		int aim = 6;
		System.out.println("Element " + aim + " found at index in rotated array "
				+ searchInRotatedArr(rotatedArr, aim) + "\n");
	}
	
	
//	main method to search in rotated array
	public static int searchInRotatedArr(int arr[], int target) {
		int pivot = findPivotInDuplicateArr(arr);

		// if you did not find a pivot, it means the array is not rotated
		if (pivot == -1) {
			// just do normal binary search
			return binarySearhForRotaredArray(arr, target, 0, arr.length - 1);
		}

		// if pivot is found, you have found 2 asc sorted arrays
		if (arr[pivot] == target) {
			return pivot;
		}
		if (target >= arr[0]) {
			return binarySearhForRotaredArray(arr, target, 0, pivot - 1);
		}

		return binarySearhForRotaredArray(arr, target, pivot + 1, arr.length - 1);
	}

	public static int binarySearhForRotaredArray(int arr[], int target, int start, int end) {

		while (start <= end) {
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

//	method to find pivot element in rotated array for non duplicate elements
	public static int findPivot(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

//			if mid element < (mid - 1) element i.e. this will return pivot
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

//			
			if (arr[start] >= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

//	method to find pivot element in rotated array for  duplicate elements
	public static int findPivotInDuplicateArr(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

//			if mid element < (mid - 1) element i.e. this will return pivot
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

//			if element of mid, start and end are same then skip them
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//				skip the duplicate 
//				Note: what if start and end will be pivot element??
//				check for the same 
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				if (arr[end] < arr[end - 1]) {
					return end;
				}
				end--;
			}

			// left side is sorted, so pivot should be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;

	}

}
