package com.example.demo.basic.aop.implementation.implementation.types;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle moving with Michelin tyres";
    }
}
