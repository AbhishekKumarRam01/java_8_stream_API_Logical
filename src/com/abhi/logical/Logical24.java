package com.abhi.logical;

public class Logical24 {
	public static void main(String[] args) {
		String input = "Abhishek Kumar";
		long count = input.toLowerCase().chars()
		.mapToObj(c->(char)c).filter(e->"aioue".indexOf(e)!=-1).count();
		System.out.println(count); 
	}

}
