package in.BikkadIT;

import org.springframework.stereotype.Component;

@Component //we can also make bean of diffrent package 
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("Person class constructor");
	}

}
