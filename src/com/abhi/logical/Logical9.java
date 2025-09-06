package com.abhi.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Logical9 {
	public static void main(String[] args) {
		String input = "Abhishek";

        Character firstNonRepeated = input.chars()   // String → IntStream
                .mapToObj(c -> (char) c)            // Int ko char me convert
                .collect(Collectors.groupingBy(
                        Function.identity(),        // har char ko group karo
                        LinkedHashMap::new,         // order preserve karo
                        Collectors.counting()       // kitni baar aya uska count
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // jo sirf 1 baar aya
                .map(Map.Entry::getKey)                 // uska key (character)
                .findFirst()                            // first non-repeated
                .orElse(null);                          // agar na mile to null

        System.out.println("First non-repeated character: " + firstNonRepeated);
	}

}
