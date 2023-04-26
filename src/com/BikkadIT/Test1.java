package com.BikkadIT;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext classPathXmlApplicationContext=new	ClassPathXmlApplicationContext("beans.xml");
	
	Student1 bean=classPathXmlApplicationContext.getBean("student1",Student1.class);
	bean.display();
	}
}
