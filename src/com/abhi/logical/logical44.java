package com.abhi.logical;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class logical44 {
	public static void main(String[] args) {
		List<Integer> list = IntStream.iterate(2, i->i+1)
		.filter(logical44::IsPrime)
		.limit(10)
		.boxed()
		.collect(Collectors.toList());
		System.out.println(list);
		
		
	}
	public static boolean IsPrime(int n) {
		return n >1 && IntStream.rangeClosed(2, (int)Math.sqrt(n))
				.allMatch(i->n%i!=0);
	}

}
