package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical34 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("listen","Devil","evile","day");
		String str="sentil";
		String s1=sorString(str);
		System.out.println(s1);
		List<String> list2 = list.stream().filter(e->sorString(e).equals(s1)).collect(Collectors.toList());
		System.out.println(list2);
	}
private static String sorString(String str) {
	return str.chars().sorted().mapToObj(e->String.valueOf((char)e)).collect(Collectors.joining());
}
}
