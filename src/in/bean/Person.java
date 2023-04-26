package in.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Person Class Constructor");
	}

	
}
