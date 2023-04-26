package com.BikkadIT;

import org.springframework.stereotype.Component;

@Component("stu")  //we can also give object name in component
public class Student {

	private int sid;
	private String sname;
	
		
	public Student() {
		super();
		System.out.println("Student class Constructor");
	}
	
	
	public void display() {
		System.out.println("Wellcome to Bikkad iT");
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
