package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,43,45,1,2,23,12,23,12,9,123,8);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(num->num%2==0));
		System.out.println(map);
		 Map<String, List<Integer>> map2 = list.stream().collect(Collectors.groupingBy(num->num%2==0?"even":"odd"));
		System.out.println(map2);
		System.out.println("_-------------------------------------------_");
		Map<Boolean, List<Integer>> map3 = list.stream().collect(Collectors.groupingBy(num->num%2==0));
		map3.forEach((k,v)->System.out.println(k+" "+v));
	}

}
