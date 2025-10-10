package com.course.spring.tut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutApplication.class, args);
		Student s1 = new Student();
		s1.setId(1L);
		s1.setFirstName("Kunal");
		s1.setLastName("Sharma");

		System.out.println(s1.toString());
	}

}
