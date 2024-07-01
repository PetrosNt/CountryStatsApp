package com.qualcotest.api.service;

import com.qualcotest.api.model.Country;
import com.qualcotest.api.model.CountryLanguage;
import com.qualcotest.api.model.Language;
import com.qualcotest.api.repository.CountryLanguageRepository;
import com.qualcotest.api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryLanguageServiceBean implements CountryLanguageService {
    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    @Override
    public List<Language> getLanguagesByCountryId(Integer countryId) {
        List<CountryLanguage> countryLanguages = countryLanguageRepository.findByCountryId(countryId);
        return countryLanguages.stream()
                .map(CountryLanguage::getLanguage)
                .collect(Collectors.toList());
    }
}
