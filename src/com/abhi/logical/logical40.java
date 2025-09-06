package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class logical40 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,6,7,5,2,1);
		Map<Integer, Integer> map = list.stream().filter(i->i%2==0).distinct().collect(Collectors.toMap(e->e, i->i*i));
		System.out.println(map);
		 int sum = list.stream().filter(e->e%2==0).mapToInt(e->e*e).sum();
		 Integer integer = new Integer(sum);
		 System.out.println(integer);
	}

}
