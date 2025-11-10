package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical8 {
public static void main(String[] args) {
	List<String> list = Arrays.asList("abhishek","Manish","Sohit","vikash","Bhuvanesh","Himanshu","Ankita","Jyoti","Swati","neha","sapna","Juli","shivani","hina","Rani");
Map<String, Long> map = list.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
System.out.println(map);
Map<String, Integer> map2 = list.stream().collect(Collectors.toMap(e->e, e->e.length()));
System.out.println(map2);
/*
 * Type Stream Conversion Method Array Arrays.stream(arr) or Stream.of(arr)
 * String str.chars().mapToObj(c->(char)c) List list.stream() Set set.stream()
 * Stack stack.stream() Queue queue.stream() Map map.entrySet().stream() or
 * map.keySet().stream() or map.values().stream() Properties
 * props.entrySet().stream() Dictionary Collections.list(dict.keys()).stream()
 */
}
}
