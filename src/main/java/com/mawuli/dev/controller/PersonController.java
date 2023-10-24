package com.mawuli.dev.controller;

import com.mawuli.dev.entity.Person;
import com.mawuli.dev.repository.PersonRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {


    private final PersonRepository personRepository;
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;


    }
    @PostMapping("/persons")
     public Person creatPerson(@RequestBody Person person){
        return personRepository.save(person);

    }


}
