package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeB {
	private String name;
	private String department;
	private double salory;

	public EmployeeB(String name, String department, double salory) {
		super();
		this.name = name;
		this.department = department;
		this.salory = salory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalory() {
		return salory;
	}

	public void setSalory(double salory) {
		this.salory = salory;
	}

	@Override
	public String toString() {
		return "EmployeeB [name=" + name + ", department=" + department + ", salory=" + salory + "]";
	}

}

public class Logical45 {
	public static void main(String[] args) {
		List<EmployeeB> list = Arrays.asList(new EmployeeB("abhi", "It", 43000.00),
				new EmployeeB("Santu", "Digital", 24000.00), new EmployeeB("Sanjeev", "halwa", 40000),
				new EmployeeB("chhotu", "Digital", 35000), new EmployeeB("chandu", "teaching", 26000),
				new EmployeeB("Sajjan", "It", 30000.00));

		Map<String, Double> map = list.stream().collect(
				Collectors.groupingBy(EmployeeB::getDepartment, Collectors.averagingDouble(EmployeeB::getSalory)));

		System.out.println(map);

	}
}
