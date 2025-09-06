package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Logical5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList();
		Integer Secondhigh = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()->new NotFindException("Not Find Second Highest Number"));
	System.out.println(Secondhigh);
	}

}
