package com.example.demo.basic.aop.implementation;

import com.example.demo.basic.practice.implementation.pojo.Owner;
import com.example.demo.basic.practice.implementation.pojo.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.demo.basic.practice.implementation")
@ComponentScan(basePackageClasses = {Owner.class, Vehicle.class})
@EnableAspectJAutoProxy //kích hoạt cơ chế AOP dựa trên proxy
public class ProjectConfiguration {
}
