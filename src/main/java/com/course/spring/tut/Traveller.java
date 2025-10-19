package com.course.spring.tut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")   // context creates spring beans for all classes with component annotation
public class Traveller {

    // Loosely coupling achieved using interface
    private Vehicle vehicle;

    @Autowired          //injects the dependency automatically using Autowired annotation
    public Traveller(@Qualifier("car") Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public  void travel(){
        this.vehicle.move();
    }
}
