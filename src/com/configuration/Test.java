package com.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext apc	=new AnnotationConfigApplicationContext(JavaConfig.class);
Student bean= apc.getBean("student",Student.class);
	bean.display();
	}

}
