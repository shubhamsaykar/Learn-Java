package com.shubham;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiStudy {

	
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(7, 4, 6, 3, 6, 7, 5, 3);

		Optional<Integer> first = nums.stream().distinct().sorted((a, b) -> (b - a)).skip(1).findFirst();
		System.out.println("Second highest " + first.get());

		System.out.println("factorial of 5 is =" + factorial(5));
		System.out.println("Number is prime =" + isPrime(4));
		sumAll();
		getAverage();
		getsfa();
		getNumberStartingWith();
		printDuplicate();
		findMax();
		findMin();
		sortList();
		System.out.println("number is prime:::" + findPrime(4));
		System.out.println("number is palindrom number:::" + isPalindrom(121));
		System.out.println("number is Armstrong:::" + isArmstrongNum(153));
		printElementsFrequency();
		printFrequencyOFcharInString();
		printMultipleOfAny();
		reverseWordsOfString();

	}

	private static void reverseWordsOfString() {
		String str = "reverse Elements Of String";
		String reverseWords = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reverse Words Of String ==>" + reverseWords);

	}

	private static void printMultipleOfAny() {
		List<Integer> list = Arrays.asList(3, 5, 6, 2, 6, 35, 3, 3, 55, 7, 2, 30, 120);
		List<Integer> multipleOf = list.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
		System.out.println("Multiple of 5 " + multipleOf);

	}

	private static void printFrequencyOFcharInString() {
		String str = "frequency";
		Map<Character, Long> frequencyMap = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency of chars in String " + frequencyMap);

	}

//	frequncy of each element in an list
	private static void printElementsFrequency() {
		List<Integer> list = Arrays.asList(3, 5, 6, 2, 6, 3, 5, 3, 3, 56, 7, 2, 3, 12);
		Map<Integer, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Frequency of elements in list " + frequencyMap);
	}

	private static boolean isArmstrongNum(int num) {

		int originalNum = num;
		int sum = 0;
		int numOfDigit = String.valueOf(num).length();

		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, numOfDigit);
			num /= 10;
		}
		if (sum == originalNum) {
			return true;
		} else {
			return false;
		}
	}

	private static void sortList() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> ascSort = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order  " + ascSort);

		List<Integer> descSort = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order  " + descSort);

	}

	private static void findMin() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max values in the list is  " + max);

	}

	private static void findMax() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min value of list is  " + min);
	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int factorial(int num) {
		int result = 1;
		while (num > 1) {
			result *= num;
			num--;
		}
		return result;
	}

	public static int sumAll() {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> reduce = list.stream().reduce((a, b) -> (a + b));
		System.out.println("Sum of all elements in array::" + reduce.get());
		return reduce.get();
	}

	public static double getAverage() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		double asDouble = list.stream().mapToInt(a -> a).average().getAsDouble();

		System.out.println("The avergae of given stream is::" + asDouble);
		return asDouble;
	}

//	square, filter and average

	public static double getsfa() {
		List<Integer> list = Arrays.asList(1, 20, 30, 4, 5, 6, 7, 8, 9);
		double asDouble = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
		System.out.println("result ===>" + asDouble);
		return asDouble;
	}

	public static void getNumberStartingWith() {
		List<Integer> nums = Arrays.asList(22, 23, 54, 32, 65, 225, 256, 264);

		List<Integer> listStartingWith = nums.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(listStartingWith);
	}

	public static void printDuplicate() {
		List<Integer> nums = Arrays.asList(22, 23, 54, 32, 65, 225, 256, 264, 22, 23, 54, 32, 65);

//				first approch
		Set<Integer> duplicate = nums.stream().filter(e -> Collections.frequency(nums, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(" First Approch \n" + duplicate);

//				second approch
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> collect = nums.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println("Second Approch \n" + collect);

	}

	public static boolean findPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrom(int num) {


		
//		normal Approch
		int originalNum = num;
		int reverseNum = 0;

		while (num != 0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num /= 10;
		}
		if (originalNum == reverseNum) {
			return true;
		} else {
			return false;
		}
		
		

	}
	
	
}
