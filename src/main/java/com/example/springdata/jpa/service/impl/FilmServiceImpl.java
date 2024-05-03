package com.example.springdata.jpa.service.impl;

import com.example.springdata.jpa.model.Film;
import com.example.springdata.jpa.repository.FilmRepository;
import com.example.springdata.jpa.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmServiceImpl implements FilmService {

    FilmRepository filmRepository;
    @Override
    public Page<Film> getAllFilms() {
        return filmRepository.findAll(PageRequest.of(5,20));
    }
}
