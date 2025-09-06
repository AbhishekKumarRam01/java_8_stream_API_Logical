package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical17 {
	public static void main(String[] args) {
		List<Number> list = Arrays.asList(12,23,34,34,90.45);
		String string = list.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(string);
	}

}
