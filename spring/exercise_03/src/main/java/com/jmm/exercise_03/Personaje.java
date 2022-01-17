package com.jmm.exercise_03;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean adult;
    Integer age;

    public Personaje() {
    }

    public Personaje(Long id, String name, Boolean adult, Integer age) {
        this.id = id;
        this.name = name;
        this.adult = adult;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adult=" + adult +
                ", age=" + age +
                '}';
    }
}
