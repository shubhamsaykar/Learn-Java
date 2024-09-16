package com.shubham;

import java.util.Iterator;

public class LinearSearch {

	public static void main(String[] args) {

//		int arr[] = { 1, 2, -4, 7, -5, 3, 76 };
//		int target = 7;
//		int index = searchElementLinear(arr, target);
//		System.out.println(index);
//		System.out.println("Minimum of arr is "+min(arr));

		fibonacciSeries(10);
		int factorial = fact(5);
		System.out.println("\n factorial of 5 is " + factorial);

		binarySearch();
	}

	public static void fibonacciSeries(int n) {

		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	public static int factorial(int n) {

		int fact = 1;

		if (n == 0) {
			return fact;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void binarySearch() {

		int arr[] = {3, 5, 6, 7, 8, 10, 13, 16 };
		int target = 13;

		int min = 0, max =arr.length -1;
		
		while(min < max) {
			int mid = (min+max)/2;
			
			if(target == arr[mid]) {
				System.out.println("Element is found at index "+mid);
			}
			
			if(arr[mid]<target) {
				min = mid +1;
			}else if(arr[mid] > target) {
				max = mid -1;
			}
		}
		System.out.println("Element is not present in array");

	}

	static int linearSearch(int arr[], int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {

			int element = arr[index];
			if (element == target) {
				return index;
			}

		}
		return -1;
	}

	static int searchElementLinear(int arr[], int target) {
		if (arr.length == 0) {
			System.out.println("The given array is of empty size");
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		System.out.print("The given array is not found in array ");
		return -1;
	}

	static int min(int arr[]) {

		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
