package com.jmm;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public void saludar() {
        System.out.println("Hola mundo");
    }
}
