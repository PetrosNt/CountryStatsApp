package com.qualcotest.api.repository;

import com.qualcotest.api.model.Country;

import java.util.List;

public interface CountryRepository {
    List<Country> getCountries();

    Country getCountry(Integer id);
}
