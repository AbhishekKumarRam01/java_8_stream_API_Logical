package com.abhi.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Logical10 {
	public static void main(String[] args) {
		String input = "abhsihek";
		Character else1 = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(else1);
		int day = 4;
		String type = switch (day) {
		case 1, 2, 3 -> "Weekday";
		case 4, 5 -> "Almost weekend";
		default -> "Weekend";
		};
		System.out.println(type); // Weekday

		String result = input.toLowerCase().chars().mapToObj(c -> (char) c).filter(e -> !"auoie".contains(e.toString()))
				.map(String::valueOf)

				.collect(Collectors.joining());
		System.out.println(result);

	}

}
