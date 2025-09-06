package com.abhi.logical;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Logical14 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(3,5,2,5,1,67,34,12,0);
	IntSummaryStatistics  start= list.stream().mapToInt(Integer::intValue)
	.summaryStatistics();
	int max = start.getMax();
	int min = start.getMin();
	double average = start.getAverage();
	long sum = start.getSum();
	System.out.println(max);
	System.out.println(min);
	System.out.println(sum);
	System.out.println(average);
	
}
}
