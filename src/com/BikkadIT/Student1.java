package com.BikkadIT;

public class Student1 {

	private int sid;
	private String sname;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student class Constructor");
	}
	
	public void display() 
	{
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
		return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
	
}
