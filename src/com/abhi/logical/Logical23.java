package com.abhi.logical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Logical23 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 12, 23, 12, 3, 23, 1, 23, 78, 7);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		Map<Integer, Long> countMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);

		List<Integer> uniqueOnly = list.stream().filter(num -> countMap.get(num) == 1).collect(Collectors.toList());
		System.out.println(uniqueOnly);
		list.stream().filter(num -> Collections.frequency(list, num) == 1).skip(1).limit(2). forEach(e -> System.out.print(e));
	}

}
