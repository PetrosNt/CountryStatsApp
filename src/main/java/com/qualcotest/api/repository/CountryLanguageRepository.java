package com.qualcotest.api.repository;

import com.qualcotest.api.model.CountryLanguage;

import java.util.List;

public interface CountryLanguageRepository {
    List<CountryLanguage> findByCountryId(Integer countryId);
}
