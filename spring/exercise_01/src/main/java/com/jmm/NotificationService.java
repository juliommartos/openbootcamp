package com.jmm;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    UserService userService;

    public NotificationService(UserService userService) {
        this.userService = userService; 
    }

    public void saludo() {
        System.out.println("Saludo desde notificationService a " + this.userService.nombre);
    }

}
