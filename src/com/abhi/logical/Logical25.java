package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical25 {
	public static void main(String[] args) {
		 List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
	        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);
	        List<Integer> collect = list1.stream().filter(e->list2.contains(e)).collect(Collectors.toList());
	        System.out.println(collect);
	        List<Integer> collect2 = list1.stream().filter(list2::contains).collect(Collectors.toList());
	        System.out.println(collect2);
	        
	}

}
