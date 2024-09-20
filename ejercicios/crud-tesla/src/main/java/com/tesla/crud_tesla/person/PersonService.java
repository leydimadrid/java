package com.tesla.crud_tesla.person;

//Este servicio actúa como MODELO

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getNames() {
        return List.of(
                new Person(
                        123L,
                        "Leydi Johana",
                        "Madrid",
                        38,
                        101010,
                        "Femenino",
                        "Leydi@gmail.com"
                ),
                new Person(
                        145L,
                        "Samuel",
                        "Rodriguez Madrid",
                        2,
                        111111,
                        "Masculino",
                        "Samuel@gmail.com"
                )


        );
    }


    public List<String> getPets() {
        return List.of(
                "Gato",
                "Perro",
                "León",
                "Tigre",
                "Pescado",
                "Bird"
        );
    }

    //Ese path es igual a la ruta para acceder a los recursos
//    @GetMapping(path = "/getNames")
//    public List<String> getNames() {
//        return List.of(
//                "Frank",
//                "Leydi",
//                "Liz",
//                "Melissa",
//                "Diego",
//                "Carlos"
//        );
//        }


}
