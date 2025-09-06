package com.abhi.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Logical10 {
	public static void main(String[] args) {
		String input = "abhsihek";
		Character c1 = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1) // jo repeat hua ho
				.map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(c1);

		int day = 2;
		String type = switch (day) {
		case 1, 2, 3 -> "Weekday";
		case 4, 5 -> "Almost weekend";
		default -> "Weekend";
		};
		System.out.println(type); // Weekday

	}

}
