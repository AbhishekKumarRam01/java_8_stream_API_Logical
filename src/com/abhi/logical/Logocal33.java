package com.abhi.logical;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Logocal33 {
	public static void main(String[] args) {
		String str = "TeLco";
		String collect = IntStream.range(0, str.length()).mapToObj(
				i -> (i < 3) ? String.valueOf(Character.toUpperCase(str.charAt(i))) : String.valueOf(str.charAt(i)))
				.collect(Collectors.joining());
		System.out.println(collect);
	}
}
