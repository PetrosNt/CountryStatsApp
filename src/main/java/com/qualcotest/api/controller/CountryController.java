package com.qualcotest.api.controller;

import com.qualcotest.api.model.Continent;
import com.qualcotest.api.model.Country;
import com.qualcotest.api.service.ContinentService;
import com.qualcotest.api.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> continents() {
        return countryService.getCountries();
    }


    @GetMapping("/country/{id}")
    public Country continent(@PathVariable int id) {
        return countryService.getCountry(id);
    }
}
