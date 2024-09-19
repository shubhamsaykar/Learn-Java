package com.shubham.String;

public class StringPrograms {

//	Java Program to reverse the string

	public static void main(String[] args) {
		String str = "Model-c";
		stringReverseUsingStringBufffer(str);
		stringReverseUsingLoop(str);
	}

//	Using StringBuffer class
	private static void stringReverseUsingStringBufffer(String str) {

		
		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println("The reverse string is:::" + reverse);

	}
	
//	Using Iterative method	
	
	private static void stringReverseUsingLoop(String str) {
		char c = 0;
		char[] charOfString = str.toCharArray();
		for(int i= charOfString.length - 1;i >= 0; i-- ) {
			 c = charOfString[i];
			 System.out.print(c);
		}
		/*
		 * 
		 * 
		 * */
	}

}
