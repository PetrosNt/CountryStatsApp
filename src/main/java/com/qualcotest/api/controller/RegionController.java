package com.qualcotest.api.controller;

import com.qualcotest.api.model.Continent;
import com.qualcotest.api.model.Region;
import com.qualcotest.api.service.ContinentService;
import com.qualcotest.api.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/regions")
    public List<Region> continents() {
        return regionService.findAll();
    }

}
