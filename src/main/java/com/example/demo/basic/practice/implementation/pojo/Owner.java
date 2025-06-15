package com.example.demo.basic.practice.implementation.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "personBean") //value = "personBean" definition for Bean that we want
//@Lazy chĩ tạo Bean khi dược yêu cầu => KO tạo trước ngay từ đầu
public class Owner {
    private String name="Lucy";
    private final Vehicle veh;
    @Autowired
    public Owner(Vehicle veh) {
        this.veh = veh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVeh() {
        return veh;
    }
}
