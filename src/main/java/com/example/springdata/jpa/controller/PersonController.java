package com.example.springdata.jpa.controller;

import com.example.springdata.jpa.model.Person;
import com.example.springdata.jpa.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class PersonController {

    PersonRepository personRepository;
    @Transactional(readOnly = true)
    @GetMapping("/")
    public void savePerson() {
        Person p = new Person();
        p.setFirstName("melon");
        p.setLastName("sweet");
        p.setDob("01/01/1990");
        //
        Sort sort = Sort.by(Sort.Direction.DESC, "Id");
        personRepository.findAll(sort).forEach(System.out::println);
        Page<Person> page = personRepository.findAll(PageRequest.of(3, 2));
        for (Person person : page.getContent()) {
            System.out.println(person);
        }

        Optional<Person> opp = personRepository.findByFirstName("Hello").findFirst();
        System.out.println(opp.get());
    }

}
