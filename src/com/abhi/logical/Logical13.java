package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private Integer age;

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class Logical13 {
	public static void main(String arg[]) {
		List<Employee> list = Arrays.asList(new Employee("Abhishek", 45), new Employee("Anand", 56),
				new Employee("Lalit ", 64), new Employee("Karn", 5));
		Map<String, Integer> map = list.stream().filter(emp -> emp.getAge() < 50)
				.collect(Collectors.toMap(emp -> emp.getName(), emp -> emp.getAge()));
		System.out.println(map);
		List<Employee> list2 = list.stream().filter(emp -> emp.getName() == "Abhishek").collect(Collectors.toList());
		System.out.println(list2);

		Map<String, Integer> map2 = list.stream().filter(emp -> emp.getName() == "Abhishek")
				.collect(Collectors.toMap(emp -> emp.getName(), emp -> emp.getAge()));
		System.out.println(map2);
	}

}
