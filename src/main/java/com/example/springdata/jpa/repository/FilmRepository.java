package com.example.springdata.jpa.repository;

import com.example.springdata.jpa.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends JpaRepository<Film,Long>, PagingAndSortingRepository<Film,Long> {


}
