package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class logical36 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "level", "java", "racecar", "apple", "noon");
		Optional<String> max = words.stream().filter(logical36::isPalindrome)
		.max(Comparator.comparing(String::length));
		if(max.isPresent()) {
			String string = max.get();
			System.out.println(string);
		}
		
		Optional<String> min = words.stream().filter(logical36::isPalindrome).min(Comparator.comparing(String::length));
		if(!min.isEmpty()) {
String string = min.get();			
System.out.println(string);
		}
	}
public static boolean isPalindrome(String str) {
return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	
}
}
