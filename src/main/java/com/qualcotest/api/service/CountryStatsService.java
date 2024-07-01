package com.qualcotest.api.service;

import com.qualcotest.api.model.CountryStats;
import com.qualcotest.api.model.TaskDTO;

import java.util.List;

public interface CountryStatsService {
    public List<CountryStats> getCountryStatsWithMaxGdpPerPopulation();
    public List<TaskDTO> getTaskDTOs(String regionName, Integer yearFrom, Integer yearTo);
}
