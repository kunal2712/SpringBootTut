package com.spring.ums;

import com.spring.ums.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
		User u1 = new User();
		u1.setFirstName("kunal");
		System.out.println(u1.getFirstName());
	}

}
