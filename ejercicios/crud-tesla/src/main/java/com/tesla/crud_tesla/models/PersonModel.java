package com.tesla.crud_tesla.models;

import jakarta.persistence.*;

@Entity // Esta clase, cada uno de los campos será una columna en la base de datos
@Table(name = "person") //Asignar nombre por defecto para que no ponga PersonModel
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Delega la responsabilidad de la clave primaria a la base de datos (Autoincremento)
    private Long id;
    private String name;
    private String lastName;
    private int age;
    private int dni;
    private String gender;
    private String email;

    public PersonModel() {
    }

    public PersonModel(Long id, String name, String lastName, int age, int dni, String gender, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.gender = gender;
        this.email = email;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
