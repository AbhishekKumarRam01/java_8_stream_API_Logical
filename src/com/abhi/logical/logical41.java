package com.abhi.logical;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class logical41 {
	public static void main(String[] args) {
		List<LocalDate> list = Arrays.asList(LocalDate.of(2023, 10, 8),LocalDate.of(2024, 12, 1),LocalDate.of(2023, 2, 02),LocalDate.of(2024, 8,7),LocalDate.of(2023, 5, 7),
				LocalDate.of(2025, 7, 9));
		Map<Integer, List<LocalDate>> map = list.stream().collect(Collectors.groupingBy(date->date.getYear()));
		System.out.println(map);
		
	}

}
