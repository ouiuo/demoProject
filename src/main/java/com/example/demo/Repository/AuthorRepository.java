package com.example.demo.Repository;

import com.example.demo.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Override
    List<Author> findAll();

    Optional<Author> findById(Long id);

    List<Author> findByNameContains(String name);



}
