package com.shubham.binarySearch;

public class LowerBound {
	
	public static void main(String[] args) {
		int arr[] = {1,4,7,8,10};
		int target = 7;
		System.out.println("Upper bound of is  "+ findUpperBound(arr, target));
		System.out.println("Lower bound of is  "+ findLowerBound(arr, target));
		
	}
	
	
	public static int findLowerBound(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			
			if(arr[mid] >= target ) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
			
		}
		return start;
	}
	
	public static int findUpperBound(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > target ) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
			
		}
		return start;
	}

}
