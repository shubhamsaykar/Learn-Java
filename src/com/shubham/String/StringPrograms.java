package com.shubham.String;

public class StringPrograms {

//	Java Program to reverse the string

	public static void main(String[] args) {
		String str = "Model-c";
		stringReverseUsingStringBufffer(str);
		System.out.print("\n");
		stringReverseUsingLoop(str);
		System.out.print("\n");
		resversString();
//		allPosibleSubString(str);
		System.out.print("\n");
		System.out.println("String length number "+str.length()+" is prime or not:=> " + isPrime(str.length()));
	}

//	Using StringBuffer class
	private static void stringReverseUsingStringBufffer(String str) {

		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer reverse = stringBuffer.reverse();
		System.out.print("The reverse string is:::" + reverse);

	}

//	Using Iterative method	

	private static void stringReverseUsingLoop(String str) {
		char c = 0;
		char[] charOfString = str.toCharArray();
		for (int i = charOfString.length - 1; i >= 0; i--) {
			c = charOfString[i];
			System.out.print(c);
		}

	}

	public static void resversString() {
		String str = "shubham";
		char c = 0;
		char[] charArray = str.toCharArray();
		for(int i = charArray.length-1 ; i>=0;i--) {
			c = charArray[i];
			System.out.print(c);
		}
				
	
	}
	
	
	
//	Print all posible sub String of String

	private static void allPosibleSubString(String str) {
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println("Sub strings of "+ str +" are: " + str.substring(i, j));
			}

		}
	}

	private static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
