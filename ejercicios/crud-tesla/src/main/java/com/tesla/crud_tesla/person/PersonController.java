package com.tesla.crud_tesla.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Este se comporta como el controlador, pero para este ejercicio también como vista,

@RestController//Convertir a restController para usar getMapping
@RequestMapping(path = "api/v1/person") //URL de entrada del controlador
public class PersonController {

    //Inicio inyección de dependencias
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    } //Fin inyección de dependencias

    @GetMapping(path = "/getNames")
    public List<Person> getNames() {
        return personService.getNames();
    }

    @GetMapping(path = "/getPets")
    public List<String> getPets() {
        return personService.getPets();
    }
};

