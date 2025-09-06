package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logical1 {
	public static void main(String arg[]) {
		List<String> list = Arrays.asList("Apple", "pineApple", "Coconut", "banana", "Papaya", "Apptizer", "mango",
				"apricot");
		List<String> list2 = list.stream().filter(e -> e.toLowerCase().contains("ap")).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.print(list2);
	}

}
