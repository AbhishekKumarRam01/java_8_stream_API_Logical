package com.abhi.logical;

import java.util.Arrays;
import java.util.List;

public class Logical32 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,34,23,12,23,34,12,90);
	 long count = list.stream().mapToInt(Integer::intValue).count();
		/*
		 * if(max.isPresent()) { int int1 = max.getAsInt(); System.out.println(int1); }
		 */
	 System.out.println(count);
}
}
