package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Logical29 {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Shubham","Karan","Abu","Sumit","Santu","abhi");
	Stream<String> stream = list.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
	stream.forEach(System.out::println);
}
}
