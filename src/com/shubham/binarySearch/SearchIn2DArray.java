package com.shubham.binarySearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10,11,12 }, 
						{ 13,14,15,16 } };
		int target = 6;

		System.out.println(Arrays.toString(searchIn2DArray(arr, target)));
	}

	static int[] searchIn2DArray(int[][] arr, int target) {

		int r = 0;
		int c = arr[0].length - 1;

		while (r < arr.length && c >= 0) {

			if (arr[r][c] == target) {
				return new int[] { r, c };
			}

			if (arr[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}

		return new int[] { -1, -1 };
	}

}
