package com.example.demo.Service.Impl;

import com.example.demo.Entity.Language;
import com.example.demo.Repository.LanguageRepository;
import com.example.demo.Service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public Language getLanguageById(Long id) {
        return languageRepository.findById(id).get();
    }

    @Override
    public Long saveLanguage(Language language) {
        return languageRepository.save(language).getId();
    }

    @Override
    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }

    @Override
    public void removeLanguageById(Long id) {
        languageRepository.deleteById(id);
    }

}
