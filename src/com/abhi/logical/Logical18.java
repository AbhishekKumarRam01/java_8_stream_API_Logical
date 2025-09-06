package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical18 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","Karam","Tata","sumit","Ajar","Abhi","All");
		List<String> list2 = list.stream().filter(str->str.length()%2==0).map(String::toUpperCase).collect(Collectors.toList());
		System.out.print(list2);
	}

}
