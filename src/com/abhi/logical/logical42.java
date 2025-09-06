package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeA{
	private int id;
	private String name;
	public EmployeeA(int id ,String name) {
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeA [id=" + id + ", name=" + name + "]";
	}
	
}
public class logical42 {
public static void main(String[] args) {
	List<EmployeeA> list = Arrays.asList(new EmployeeA(1,"abhi"),
			new EmployeeA(2,"Kumar"),
			new EmployeeA(3,"Saurabh"),
			new EmployeeA(4,"Kabil"),
			new EmployeeA(5,"abhi"));
	
	Map<String, Long> map = list.stream().collect(Collectors.groupingBy(EmployeeA::getName,Collectors.counting()));//
	List<EmployeeA> list2 = list.stream().filter(e->map.get(e.getName())==1).collect(Collectors.toList());//Unique name
	System.out.println(list2);
	
	
	
}
}
