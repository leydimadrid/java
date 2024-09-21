package com.tesla.crud_tesla.repositories;

import com.tesla.crud_tesla.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository; // Interfaz de Spring Data JPA que proporciona métodos CRUD
import org.springframework.stereotype.Repository;

@Repository //Clase que permite hacer consultas a una base de datos
//JpaRepository<T, ID> //Tipo de identidad y su clave primaria
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
