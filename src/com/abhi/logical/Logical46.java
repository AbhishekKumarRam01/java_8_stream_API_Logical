package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logical46 {
public static  void main(String arg[]) {
	List<Integer> list = Arrays.asList(1,0,4,3,2,0,-5,-8,0,5,8,-9);
	List<Integer> list2 = Stream.concat(list.stream().filter(e->e!=0), list.stream().filter(e->e==0)).collect(Collectors.toList());
	System.out.println(list2);
}
}
