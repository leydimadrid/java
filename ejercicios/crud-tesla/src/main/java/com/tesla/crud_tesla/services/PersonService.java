package com.tesla.crud_tesla.services;

import com.tesla.crud_tesla.models.PersonModel;
import com.tesla.crud_tesla.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired //Inyectar dependencias
    PersonRepository personRepository;

    //Obtener todas las personas
    //Metodo de Jpa Repository, para buscar todos los  usuarios, el tipo de lado arrayList
    public ArrayList<PersonModel> getPerson() {
        return (ArrayList<PersonModel>) personRepository.findAll();

    }

    //Guardar una persona
    public PersonModel savePerson(PersonModel person) {
        return personRepository.save(person);
    }

    //Obtener la persona a través de un ID
    public Optional<PersonModel> getById(Long id) {
        return personRepository.findById(id);
    }

    //Actualizar
    public PersonModel updateById(PersonModel request, Long id) {
        PersonModel person = personRepository.findById(id).get();

        person.setName(request.getName());
        person.setLastName(request.getLastName());
        person.setAge(request.getAge());
        person.setDni(request.getDni());
        person.setGender(request.getGender());
        person.setEmail(request.getEmail());
        personRepository.save(person);

        return person;
    }

    //Eliminar
    public Boolean deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
