package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical16 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple","apply","pineapple","ape","Orange");
		List<String> list2 = list.stream().filter(str->str.toLowerCase().startsWith("ap")).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

}
