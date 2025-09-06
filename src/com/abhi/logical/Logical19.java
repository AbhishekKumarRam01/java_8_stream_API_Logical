package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical19 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","spring","Aws","micro-services","Spring security","hibernate");
		List<Integer> list2 = list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(list2);
	}

}
