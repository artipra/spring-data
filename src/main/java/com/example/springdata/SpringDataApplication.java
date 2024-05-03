package com.example.springdata;

import com.example.springdata.jpa.model.Person;
import com.example.springdata.jpa.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        System.out.println("maine before----------");
        SpringApplication.run(SpringDataApplication.class, args);
        System.out.println("maine after----------");
       // test();
    }


//    @Bean
//    CommandLineRunner runner(PersonRepository personRepository) {
//        return args -> {
//            Person p = new Person();
//            p.setFirstName(args[0]);
//            p.setLastName("kumari");
//            p.setDob("01/01/1990");
//            personRepository.save(p);
//        };
//    }

}
