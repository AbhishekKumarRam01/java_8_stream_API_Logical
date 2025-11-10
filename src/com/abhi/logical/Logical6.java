package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,43,45,1,2,23,12,23,12,9,123,8);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(e->e%2==0));
		System.out.println(map);
        Map<Boolean, List<Integer>> map2 = list.stream().collect(Collectors.groupingBy(e->e%2!=0));
        System.out.println(map2);
		Map<String, List<Integer>> map3 = list.stream().collect(Collectors.groupingBy(e->e%2==0?"Even":"Odd"));
		System.out.println(map3);
	}

}
