package com.tesla.crud_tesla.controllers;

import com.tesla.crud_tesla.models.PersonModel;
import com.tesla.crud_tesla.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//Este se comporta como el controlador, pero para este ejercicio también como vista,
@RestController//Convertir a restController para usar getMapping
@RequestMapping(path = "/person") //URL de entrada del controlador
public class PersonController {

    //Inicio inyección de dependencias
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    } //Fin inyección de dependencias


    @GetMapping
    public ArrayList<PersonModel> getPerson() {
        return this.personService.getPerson();
    }

    @PostMapping
    //La anotación @RequestBody se utiliza en Spring para indicar que el contenido de la solicitud HTTP (request) debe ser mapeado a un objeto Java.
    public PersonModel savePerson(@RequestBody PersonModel person) {
        return this.personService.savePerson(person);
    }

    @GetMapping(path = "/{id}")
    public Optional<PersonModel> getPersonById(@PathVariable("id") Long id) {
        return this.personService.getById(id);
    }

    @PutMapping(path = "/{id}") //Cambia todos los objetos si fuera una sola cosa sería Path
    public PersonModel updatePersonById(@RequestBody PersonModel request, @PathVariable Long id) {
        return this.personService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean isOk = this.personService.deletePerson(id);

        if (isOk) {
            return "Person with id " + id + " delete!";
        } else {
            return "Error";
        }
    }
}

