package com.qualcotest.api.controller;


import com.qualcotest.api.model.Language;
import com.qualcotest.api.service.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryLanguageController {

    @Autowired
    private CountryLanguageService countryLanguageService;

    @GetMapping("/languages/{countryId}")
    public List<Language> getLanguagesForCountry(@PathVariable Integer countryId) {
        return countryLanguageService.getLanguagesByCountryId(countryId);
    }
}
