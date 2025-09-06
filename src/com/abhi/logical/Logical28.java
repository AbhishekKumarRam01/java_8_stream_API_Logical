package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class person{
	
	private String name;
	private String Department;
	public person(String name, String department) {
		super();
		this.name = name;
		Department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", Department=" + Department + "]";
	}
	
}
public class Logical28 {
	public static void main(String[] args) {
		List<person> list = Arrays.asList(new person("abhi","it"),new person("Shubham","it"),new person("sourabh","sales"),new person("sakshi","hr"));
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(person::getDepartment,Collectors.counting()));
		System.out.println(map);
	}

}
