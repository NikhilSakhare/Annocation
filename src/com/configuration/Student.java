package com.configuration;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sid;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	System.out.println("Student class Constructor");
	}
	public void display() {
		System.out.println("Wellcome to Salekasa");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
	
	

}
