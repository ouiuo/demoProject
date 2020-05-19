package com.example.demo.Service;

import com.example.demo.Entity.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAllLanguages();

    Language getLanguageById(Long id);

    Long saveLanguage(Language language);

    void updateLanguage(Language language);

    void removeLanguageById(Long id);

}
