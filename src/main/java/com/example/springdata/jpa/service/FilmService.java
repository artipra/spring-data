package com.example.springdata.jpa.service;

import com.example.springdata.jpa.model.Film;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FilmService {
    public Page<Film> getAllFilms();
}
