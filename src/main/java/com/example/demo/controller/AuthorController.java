package com.example.demo.controller;

import com.example.demo.Entity.Author;
import com.example.demo.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getById(id);
    }

    @GetMapping("/findByName")
    public List<Author> getAuthorByName(@RequestParam String name) {
        return authorService.getAuthorsWithName(name);
    }

    @PostMapping("new")
    public Long createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @PutMapping("update")
    public Long updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("remove/{id}")
    public void removeAuthorById(@PathVariable Long id) {
        authorService.removeAuthorById(id);
    }

}
