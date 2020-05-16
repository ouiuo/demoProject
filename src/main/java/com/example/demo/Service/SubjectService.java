package com.example.demo.Service;

import com.example.demo.Entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();

    Subject getById(Long id);

    Long saveSubject(Subject subject);

    void updateSubject(Subject subject);

    void removeSubjectById(Long id);

}
