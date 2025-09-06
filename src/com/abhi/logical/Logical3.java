package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical3 {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Raman","karan","Suman","rajiv","Jyoti","rav","ram","K");
	Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(map);
			}
}
