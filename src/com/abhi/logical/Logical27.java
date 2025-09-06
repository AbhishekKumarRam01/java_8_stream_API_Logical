package com.abhi.logical;

import java.util.Arrays;
import java.util.List;

public class Logical27 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		Integer reduce = list.stream().reduce(1,(a,b)->a*b);
		System.out.println(reduce);
	}

}
