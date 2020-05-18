package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "languages")
public class Language {
    @Id
    @GeneratedValue(generator = "languages_sequence")
    private Long id;
    private String name;

}
