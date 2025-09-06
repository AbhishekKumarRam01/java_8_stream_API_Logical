package com.abhi.logical;

import java.util.*;
import java.util.stream.*;

public class Logical21 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Abhishek", "Java", "Code", "AI", "Spring", "Boot", "AbhishekI");

		Map<String, List<String>> grouped = words.stream()
				.collect(Collectors.groupingBy(s -> (s.length() % 2 == 0) ? "Even" : "Odd", // Key: Even/Odd
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream().sorted(Comparator.comparingInt(String::length)) // sort by length
										.collect(Collectors.toList()))));
		System.out.println(grouped);

	}
}
