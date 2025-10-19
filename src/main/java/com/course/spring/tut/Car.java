package com.course.spring.tut;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car")  // Annotation based configuration
@Primary            // When multiple beans of same type , preference can be given using Primary annotation
public class Car implements Vehicle {

    @Override
    public void move(){
        System.out.println("Car moves");
    }
}
