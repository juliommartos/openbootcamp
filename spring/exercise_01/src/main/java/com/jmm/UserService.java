package com.jmm;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public String nombre;

    public UserService() {
        this.nombre = "Julio";
    }
}
