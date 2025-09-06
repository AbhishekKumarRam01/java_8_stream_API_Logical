package com.abhi.logical;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class logical35 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2025,9,4);
		LocalDate endDate = LocalDate.of(2025, 9, 10);
		long  l = Stream.iterate(start,date->date.plusDays(1)).limit(start.until(endDate).getDays()+1).count();
	System.out.println(l);
	List<LocalDate> list = Stream.iterate(start, date->date.plusDays(1)).limit(start.until(endDate).getDays()+1).collect(Collectors.toList());
	System.out.println(list);
	list.forEach(System.out::println);
	}}