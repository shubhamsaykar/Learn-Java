package com.shubham;


public class Main {

	
	public static void main(String[] args) {
		pattern1(4);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern7(5);
		pattern8(5);
		pattern9(5);
		pattern10(5);
		pattern11(5);
		pattern12(4);
		pattern13(5);
		pattern14(5); 
		
		

	}

	 static void pattern13(int n) {
		for (int i = 0; i <= n; i++) {
			
			for (int k = 0; k < i ;k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	 
	 
	 static void pattern14(int n) {
			for (int i = 0; i <=2* n ; i++) {
				
				int c = i > n ? 2 * n - i : i;
				for (int k = 0; k < c ;k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n-c ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	 static void pattern12(int n) {
		int originalN = n;
		n = 2 * n;
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - 1; j++) {
				int value = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j)) + 1;
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
	 
	 
	 

	static void pattern1(int n) {
//		outer loop for number of rows
		for (int i = 1; i <= n; i++) {
//			inner loop is to how many colomns in single row
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
//			when one row is printed , add a new line 
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
//		outer loop for number of rows
		for (int i = 1; i <= n; i++) {
//			inner loop is to how many colomns in single row
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
//			when one row is printed , add a new line 
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 0; i < 2 * n; i++) {
			int c = i > n ? 2 * n - i : i;
			for (int j = 0; j < c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		for (int i = 0; i < 2 * n; i++) {
			int c = i > n ? 2 * n - i : i;

			int noOfSpaces = n - c;
			for (int k = 0; k < noOfSpaces; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/**
	 * @param n
	 */
	static void pattern7(int n) {
		for (int i = 0; i <= n; i++) {

			int noOfSpaces = n - i;
			for (int j = 0; j < noOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	static void pattern9(int n) {
		for (int row = 1; row <= n; row++) {

			for (int space = 0; space < n - row; space++) {
				System.out.print("  ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print("* ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {

			for (int space = 0; space < n - row; space++) {
				System.out.print("  ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern11(int n) {
		for (int row = 0; row <= 2 * n - 1; row++) {

			int c = row > n ? 2 * n - row : row;

			for (int space = 0; space < n - c; space++) {
				System.out.print("  ");
			}

			for (int col = c; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= c; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
