package com.example.springdata.jpa.repository;

import com.example.springdata.jpa.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Stream;

//public interface PersonRepository extends Repository<Person,Long> {
public interface PersonRepository extends
        CrudRepository<Person,Long>, PagingAndSortingRepository<Person,Long> {
    Stream<Person> findByFirstName(String firstName);
}
