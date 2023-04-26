package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan (basePackages = {"com.bean","in.bean"})
public class JavaConfig {
	
	@Bean
	@Scope(value="singleton")
	public Student getStudent() {
		Student stu = new Student();
		return stu;

	}

	@Bean
	public Employee getEmployee() {

		Employee emp = new Employee();
		return emp;
	}
}
