package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Logical7 {
public static void main(String[] args) {
	List<String> list = Arrays.asList("java","Pythan","Cplusplus","Dotnetaaaaa","RubyandDels","Mysql");
Optional<String> max = list.stream().max(Comparator.comparingInt(String::length));
	System.out.println(max);
	}
}
