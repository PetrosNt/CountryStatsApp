package com.qualcotest.api.controller;

import com.qualcotest.api.model.CountryStats;
import com.qualcotest.api.model.TaskDTO;
import com.qualcotest.api.service.CountryStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryStatsController {
    @Autowired
    private CountryStatsService countryStatsService;

    @GetMapping("/maxgdp")
    public List<CountryStats> getLanguagesForCountry() {
        return countryStatsService.getCountryStatsWithMaxGdpPerPopulation();
    }

    @GetMapping("/task3Data")
    public List<TaskDTO> getTask3Data(@RequestParam(required = false) String regionName,
                                      @RequestParam(required = false) Integer yearFrom,
                                      @RequestParam(required = false) Integer yearTo) {
        return countryStatsService.getTaskDTOs(regionName,yearFrom,yearTo);
    }
}
