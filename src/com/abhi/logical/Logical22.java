package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logical22 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,45,56,34,23,67,56,34,78);
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(list2);
	}

}
