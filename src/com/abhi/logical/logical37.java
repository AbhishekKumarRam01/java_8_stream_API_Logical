package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class logical37 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(89, 23, 12, 23, 11);
		List<String> collect = list.stream().map(Integer::toHexString).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(collect);

	}
}
