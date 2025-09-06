package com.abhi.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	private Integer id;
	private String name;
	private Integer  age;
	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class Logical15 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(1,"abhi",24),new Student(2,"Karan",26),new Student(4,"Suman",34),new Student(45,"Dadda",29));
		List<Student> list2 = list.stream().sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName)).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list);
	}

}
