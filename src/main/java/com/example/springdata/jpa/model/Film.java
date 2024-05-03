package com.example.springdata.jpa.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Film {

    @Id
    @Column(name="film_id")
    private int id;
    private String title;
    private String description;
    private String releaseYear;
}
