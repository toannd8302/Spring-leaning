package com.example.demo.basic.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle()); //Create an dependency with Vehicle class
//        return person;
//    }

    @Bean
    public  Person person2(Vehicle vehicle){
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }

}
