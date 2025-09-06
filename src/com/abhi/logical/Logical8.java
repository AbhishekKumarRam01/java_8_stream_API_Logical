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
}
}
