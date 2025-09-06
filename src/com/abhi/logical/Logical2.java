package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical2 {
	public static void main(String arg[]) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(num -> num, num -> num * num));
		System.err.println(map);
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));// ye
																													// sirf
																													// 2
																													// hi
																													// key
																													// create
																													// karta
																													// hai
																													// Boolean
		System.out.println(collect);
		Map<Boolean, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(num -> num % 2 == 0));// grouping
																													// Method
																													// Multiple
																													// key
																													// create
																													// karta
																													// hai
		// System.out.println(collect2);
	}

}
