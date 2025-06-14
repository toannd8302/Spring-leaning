package com.example.demo.basic.dependency;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
        System.out.println("Vehicle bean create d by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("PRintting Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
