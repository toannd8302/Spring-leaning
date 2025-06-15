package com.example.demo.basic.practice;

import com.example.demo.basic.practice.implementation.pojo.Owner;
import com.example.demo.basic.practice.implementation.pojo.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.basic.practice.implementation")
@ComponentScan(basePackageClasses = {Owner.class, Vehicle.class})
public class ProjectConfiguration {
}
