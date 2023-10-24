package com.mawuli.dev.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Intern")
public class Intern {
    private String firstName;
    private String lastName;
    private String school;
    private int dateOfBirth;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    public Intern(String firstName, String lastName, String school, long id, int dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public Intern(){


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchool() {
        return school;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intern model)) return false;
        return getDateOfBirth() == model.getDateOfBirth() && getId() == model.getId() && Objects.equals(getFirstName(), model.getFirstName()) && Objects.equals(getLastName(), model.getLastName()) && Objects.equals(getSchool(), model.getSchool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSchool(), getDateOfBirth(), getId());
    }

    @Override
    public String toString() {
        return "Model{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", school='" + school + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                '}';
    }
}
