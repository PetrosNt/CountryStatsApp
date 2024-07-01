package com.qualcotest.api.service;

import com.qualcotest.api.model.Country;
import com.qualcotest.api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceBean implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> getCountries() {
        return countryRepository.getCountries();
    }

    @Override
    public Country getCountry(int id) {
        return countryRepository.getCountry(id);
    }
}
