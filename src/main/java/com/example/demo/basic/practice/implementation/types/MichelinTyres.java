package com.example.demo.basic.practice.implementation.types;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle moving with Michelin tyres";
    }

    @Override
    public boolean rotateBool() {
        return true;
    }
}
