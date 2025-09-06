package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Logical12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 2, 3, 12, 23, 12, 29, 89, 7, 31, 37);
		OptionalDouble average = list.stream().filter(Logical12::isPrimeSqrt).mapToInt(Integer::intValue).average();
		System.out.println(average);
		int sum = list.stream().filter(Logical12::isPrimeSqrt).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	private static boolean isPrimeSqrt(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				
				return false;
			}
		}
		System.out.println(num);
		return true;
	}

}
