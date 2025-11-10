package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Logical4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		List<Integer> list3 = Arrays.asList(9,10,11,12);
		double d = Stream.concat(list.stream(),Stream.concat(list2.stream(), list3.stream())).distinct().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(d);
	}
}
