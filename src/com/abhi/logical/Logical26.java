package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Logical26 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,3,5,3,8);
	Stream<String> map = list.stream().map(Integer::toBinaryString);
	map.forEach(System.out::println);
	}

}
