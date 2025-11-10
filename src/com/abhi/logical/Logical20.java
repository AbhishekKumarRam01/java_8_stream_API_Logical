package com.abhi.logical;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logical20 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(new int[] {0,1}, num->new int[] {num[1],num[1]+num[0]})
		.limit(10).map(num->num[0]).collect(Collectors.toList());
		
		System.out.println(list); 
		List<Integer> collect = Stream.iterate(new int[] {0,3}, num->new int[] {num[1],num[1]+2}).limit(10)
				.map(num->num[0])
		.collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> list2 = Stream.iterate(new int[] {0,1}, num->new int[] {num[1],num[1]+1})
		.limit(10).map(num->num[0])
		.collect(Collectors.toList());
		System.out.println(list2);
		List<Integer> list3 = Stream.iterate(new int[] {0,2}, num->new int[] {num[1],num[1]+2})
		.limit(10)
		.map(num->num[0])
		.collect(Collectors.toList());
		System.out.println(list3);
		List<Integer> list4 = Stream.iterate(new int[] {256,128}, num->new int[] {num[1],num[1]/2})
		.limit(5)
		.map(num->num[0])
		.collect(Collectors.toList());
		System.out.println(list4);
		List<Integer> list5 = Stream.iterate(new int[] {2,4}, num->new int[] {num[1],num[1]*2}).limit(10)
		.map(num->num[0])
		.collect(Collectors.toList());
		System.out.println(list5);
	} 

}
 