package com.abhi.logical;

import java.util.Arrays;

public class logical43 {
	public static void main(String[] args) {
		String str[] = { "abhishek", "medam", "Kapoor", "malayalam", "namana", "banana", "papa", "kunnor" };
		String[] array = Arrays.stream(str).filter(logical43::IsPalindrom).toArray(String[]::new);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static boolean IsPalindrom(String str) {

		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
