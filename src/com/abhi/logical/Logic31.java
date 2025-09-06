package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logic31 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,45,56,67,871,23,1,23,23,5);
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
	}

}
