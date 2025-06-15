package com.example.demo.basic;

import com.example.demo.basic.dependency.Person;
import com.example.demo.basic.practice.ProjectConfiguration;
import com.example.demo.basic.practice.implementation.pojo.Owner;
import com.example.demo.basic.practice.implementation.pojo.Vehicle;
import com.example.demo.basic.practice.implementation.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("Before retrieving the Owner from bean from the Spring Context");
        String[] persons = context.getBeanNamesForType(Owner.class);
        Owner person = context.getBean(Owner.class);
        System.out.println("After retrieving the Owner bean from Spring Context");
        String[] names = context.getBeanNamesForType(Vehicle.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        vehicle.getVehicleServices().playMusic();
//        vehicle.getVehicleServices().moveVehicle();
        person.getVeh().getVehicleServices().playMusic();
        person.getVeh().getVehicleServices().moveVehicle();
        VehicleServices services1 = context.getBean(VehicleServices.class);
        VehicleServices services2 = context.getBean("vehicleServices" ,VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1: " + services1.hashCode() );
        System.out.println("Hashcode of the object vehicleServices2: " + services2.hashCode() );
        if (services1 == services2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }



    }
}
