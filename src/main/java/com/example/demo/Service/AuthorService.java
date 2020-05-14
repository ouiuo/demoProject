package com.example.demo.Service;

import com.example.demo.Entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();

    Author getById(Long id);

    List<Author> getAuthorsWithName(String name);

    Long saveAuthor(Author author);

    Long updateAuthor(Author author);

    void removeAuthorById(Long id);

}
