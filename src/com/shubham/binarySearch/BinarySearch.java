package com.shubham.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		try {
			System.out.println("Element found at index :" + binarySearch(726) + "\n");

//			System.out
//					.println("Element found at index which is greater than target  :" + nextGreatestLetter('j') + "\n");
//			System.out.println("Output of ::" + searchInsert(4));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int searchInsert(int target) {

		int arr[] = { 1, 3, 5, 6 };
		int start = 0, end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return start;
	}

	public static int binarySearch(int target) {

		int arr[] = { 0, 4, 10, 18, 34, 41, 44, 48, 87, 89, 121, 141, 148, 160, 170, 172, 194, 209, 217, 238, 239, 262,
				266, 279, 290, 297, 304, 315, 316, 332, 362, 392, 394, 421, 424, 443, 450, 467, 483, 489, 496, 502, 504,
				506, 510, 519, 525, 526, 527, 548, 560, 567, 570, 577, 580, 583, 589, 599, 600, 609, 610, 614, 621, 637,
				649, 653, 656, 656, 666, 669, 674, 678, 689, 699, 699, 703, 726, 732, 736, 742, 771, 801, 803, 812, 823,
				829, 835, 860, 861, 868, 868, 873, 894, 904, 925, 939, 956, 974, 978, 983 };

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;

	}

	public static char nextGreatestLetter(char target) {

		char[] letters = { 'c', 'f', 'j' };

		int start = 0, end = letters.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return letters[start % letters.length];

	}

}
