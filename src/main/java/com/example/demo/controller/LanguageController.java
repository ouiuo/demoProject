package com.example.demo.controller;

import com.example.demo.Entity.Language;
import com.example.demo.Service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("language")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    @GetMapping("all")
    public List<Language> getAll() {
        return languageService.getAllLanguages();
    }

    @GetMapping("{id}")
    public Language getById(@PathVariable Long id) {
        return languageService.getLanguageById(id);
    }

    @PostMapping("new")
    public Long addLanguage(@RequestBody Language language) {
        return languageService.saveLanguage(language);
    }

    @PutMapping("update")
    public void updateLanguage(@RequestBody Language language) {
        languageService.updateLanguage(language);
    }

    @DeleteMapping("remove/{id}")
    public void removeLanguageById(@PathVariable Long id) {
        languageService.removeLanguageById(id);
    }

}
