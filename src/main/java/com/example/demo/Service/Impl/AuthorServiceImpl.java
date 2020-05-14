package com.example.demo.Service.Impl;

import com.example.demo.Entity.Author;
import com.example.demo.Repository.AuthorRepository;
import com.example.demo.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getById(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> getAuthorsWithName(String name) {
        return authorRepository.findByNameContains(name);
    }

    @Override
    public Long saveAuthor(Author author) {
        return authorRepository.save(author).getId();
    }

    @Override
    public Long updateAuthor(Author author) {
        if (authorRepository.existsById(author.getId())) {
            authorRepository.save(author);
        }
        return null;
    }

    @Override
    public void removeAuthorById(Long id) {
        if (authorRepository.existsById(id)) {
            authorRepository.deleteById(id);
        }
    }


}
