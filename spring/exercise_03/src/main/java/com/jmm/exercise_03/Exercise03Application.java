package com.jmm.exercise_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exercise03Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Exercise03Application.class, args);
        PersonajeRepository repository = context.getBean(PersonajeRepository.class);

        Personaje pj = new Personaje(null, "Eldar", true, 32);
        repository.save(pj);
        System.out.println(repository.findAll());
    }

}
