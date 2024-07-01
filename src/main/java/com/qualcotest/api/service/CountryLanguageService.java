package com.qualcotest.api.service;

import com.qualcotest.api.model.Language;

import java.util.List;

public interface CountryLanguageService {
    public List<Language> getLanguagesByCountryId(Integer countryId);
}
