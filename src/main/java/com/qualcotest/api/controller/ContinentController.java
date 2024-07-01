package com.qualcotest.api.controller;

import com.qualcotest.api.model.Continent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qualcotest.api.service.ContinentService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ContinentController {

    @Autowired
    private ContinentService continentService;

    @GetMapping("/continents")
    public List<Continent> continents() {
        return continentService.getContinents();
    }
}
