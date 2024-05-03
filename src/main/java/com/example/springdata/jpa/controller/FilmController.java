package com.example.springdata.jpa.controller;


import com.example.springdata.jpa.model.Film;
import com.example.springdata.jpa.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
@AllArgsConstructor
public class FilmController {

    FilmService filmService;
    @GetMapping()
    public ResponseEntity<Page<Film>> getAllFilms(){
      Page<Film> films = filmService.getAllFilms();
      return ResponseEntity.ok().body(films);
    }

}
