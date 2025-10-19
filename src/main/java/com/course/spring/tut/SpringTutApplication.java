package com.course.spring.tut;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.course.spring.tut")
public class SpringTutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutApplication.class, args);
//		Student s1 = new Student();
//		s1.setId(1L);
//		s1.setFirstName("Kunal");
//		s1.setLastName("Sharma");

//		System.out.println(s1.toString());

//		Vehicle v1 = new Car();



		/*
		Creating spring IOC container
		Read the configuration class
		Create and manage spring beans
		 */

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve spring beans from application context
		Car c1 = appContext.getBean(Car.class);
		c1.move();



		Traveller t1 = appContext.getBean(Traveller.class);
		t1.travel();

	}

}
