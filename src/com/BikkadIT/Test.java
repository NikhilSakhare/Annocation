package com.BikkadIT;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		  ClassPathXmlApplicationContext classPathXmlApplicationContext= new
		  ClassPathXmlApplicationContext("beans.xml");
		  
		  Student student=classPathXmlApplicationContext.getBean("stu",Student.class);
		  System.out.println(student);
		 
				 
		}

}
