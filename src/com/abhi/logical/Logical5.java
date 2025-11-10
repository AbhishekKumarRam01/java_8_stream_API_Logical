package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Logical5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(89);
		Integer Secondhi = list.stream().sorted(Comparator.reverseOrder()).skip(1).distinct().findFirst()
				.orElseThrow(() -> new NotFindException("Nahi MIla "));
		System.out.println(Secondhi);
	}
}