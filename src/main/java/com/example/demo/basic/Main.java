package com.example.demo.basic;

import com.example.demo.basic.dependency.Person;
import com.example.demo.basic.practice.ProjectConfiguration;
import com.example.demo.basic.practice.implementation.pojo.Owner;
import com.example.demo.basic.practice.implementation.pojo.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        String[] persons = context.getBeanNamesForType(Owner.class);
        Owner person = context.getBean(Owner.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        vehicle.getVehicleServices().playMusic();
//        vehicle.getVehicleServices().moveVehicle();
        person.getVeh().getVehicleServices().playMusic();
        person.getVeh().getVehicleServices().moveVehicle();
    }
}
