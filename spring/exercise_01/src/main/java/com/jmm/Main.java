package com.jmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludar = (Saludo) context.getBean("saludo");
        saludar.saludar();

        NotificationService notificar = (NotificationService) context.getBean("notificationService");
        notificar.saludo();
    }
}
