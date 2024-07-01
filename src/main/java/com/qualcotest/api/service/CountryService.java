package com.qualcotest.api.service;

import com.qualcotest.api.model.Country;

import java.util.List;

public interface CountryService {
    List<Country>  getCountries();

    Country getCountry(int id);

}
