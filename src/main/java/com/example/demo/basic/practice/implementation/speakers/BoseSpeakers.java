package com.example.demo.basic.practice.implementation.speakers;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
