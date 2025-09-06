package com.abhi.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person2{
	private String fname;
	private String lname;
	private String email;
	public Person2(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class Logical30 {
public static void main(String[] args) {
	List<Person2> list = Arrays.asList(new Person2("abhi","sharam","ak21@gmil.com"),new Person2("Sachin","Kapoor","abhi@gmail.com"));
	List<String> list2 = list.stream().filter(e->e.getLname().equals("sharam")).map(e->e.getEmail()).collect(Collectors.toList());
	System.out.println(list2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
