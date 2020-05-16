package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name= "subjects")
public class Subject {
    @Id
    @GeneratedValue(generator = "subjects_sequence")
    private Long id;
    private String name;

}
