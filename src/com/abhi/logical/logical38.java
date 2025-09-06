package com.abhi.logical;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class logical38 {
	public static void main(String[] args) {
		String str="absndps";
		int length=2;
		Set<String> set = IntStream.rangeClosed(0, str.length()-length)
		.mapToObj(i->str.substring(i, i+length)).collect(Collectors.toSet());
		System.out.println(set);
	}

}