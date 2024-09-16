package com.shubham;

public class BinarySearch {
	
	public static void main(String[] args) {
		System.out.println("Element found at :\n"+binarySearch());
	}
	
	
	public static int binarySearch() {
		
		int arr[] = {3,5,6,7,8,10,13,16};
		int target = 10;
		
		int min = 0, max = arr.length-1;
		
		while(min <= max) {
			int mid = (min+max)/2;
			
			if(target == arr[mid]) {
				return mid;
			}
			
			if(arr[mid]<target) {
				min = mid +1;
			}else if(arr[mid]>target) {
				max = mid -1;
			}
			
		}
		return -1;
		
	}

}
