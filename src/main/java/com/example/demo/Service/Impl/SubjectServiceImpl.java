package com.example.demo.Service.Impl;

import com.example.demo.Entity.Subject;
import com.example.demo.Repository.SubjectRepository;
import com.example.demo.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getById(Long id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public Long saveSubject(Subject subject) {
        return subjectRepository.save(subject).getId();
    }

    @Override
    public void updateSubject(Subject subject) {
        if (subjectRepository.existsById(subject.getId())) {
            subjectRepository.save(subject);
        }
    }

    @Override
    public void removeSubjectById(Long id) {
        if (subjectRepository.existsById(id)) {
            subjectRepository.deleteById(id);
        }
    }

}
