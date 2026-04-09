package com.edomocar.webapp.AplicationWeb.models;

public class User {
    private String name;
    private String lastName;
    private Integer edad;
    private String email;

    public User() {
    }

    public User(String name, String lastName, Integer edad, String email) {
        this(name, lastName, edad);
        this.email = email;
    }

    public User(String name, String lastName, Integer edad) {
        this.name = name;
        this.lastName = lastName;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
