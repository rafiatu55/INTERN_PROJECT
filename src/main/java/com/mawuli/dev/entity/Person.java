package com.mawuli.dev.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "persons")
public class Person {

    private String name;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    public Person(String name, int age, long id){
        this.name = name;
        this.age = age;
         this.id = id;
    }

    public Person(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

