package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "authors")
public class Author {
    @Id
    @GeneratedValue(generator = "author_sequence")
    private long id;
    @Column
    private String name;
    @Column
    private String info;

}
