package com.abhi.logical;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logical20 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(new int[] { 0, 1 }, pair -> new int[] { pair[1], pair[0] + pair[1] })
				.limit(20).map(pair -> pair[0]).collect(Collectors.toList());
		System.out.println(list);
	}

}
