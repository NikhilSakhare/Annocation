package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.bean.Person;

public class Test {
	public static void main(String[] args) {

		ApplicationContext apc=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student bean = apc.getBean("getStudent",Student.class);
	    System.out.println(apc.isSingleton("getStudent"));
	     System.out.println(apc.isPrototype("getStudent"));
	    bean.display();
	    
	    Employee bean1 = apc.getBean("getEmployee",Employee.class);
	    bean1.show();
	    
	    
	    Person bean2 = apc.getBean("person",Person.class);
	     System.out.println(apc.isSingleton("person"));
	     System.out.println(apc.isPrototype("person"));
	    
	}

}
