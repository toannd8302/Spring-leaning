package com.example.demo.basic.practice.implementation.services;

import com.example.demo.basic.practice.implementation.speakers.Speakers;
import com.example.demo.basic.practice.implementation.types.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_SINGLETON) default
@Scope(BeanDefinition.SCOPE_PROTOTYPE) // Mỗi lần sử dụng thì Spring sẽ t động tạo khởi tạo đối tượng mới
public class VehicleServices {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        System.out.println(status);
    }
    public void moveVehicle(boolean status) {
         status = tyres.rotateBool();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTypes(Tyres tyres) {
        this.tyres = tyres;
    }
}
