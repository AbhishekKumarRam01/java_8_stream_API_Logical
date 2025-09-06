package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Logical11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","spring","Aws","spring Boot","hibernate","jdbc");
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(str->str, str->str.length()));
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
