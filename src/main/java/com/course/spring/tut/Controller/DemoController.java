package com.course.spring.tut.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Creating a demo controller and hitting an endpoint
@RestController
public class DemoController {

    @GetMapping("/greet")
    public  String greetMe(){
        return "Hello world!";
    }
}
