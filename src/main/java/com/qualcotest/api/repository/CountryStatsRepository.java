package com.qualcotest.api.repository;

import com.qualcotest.api.model.CountryStats;
import com.qualcotest.api.model.Region;
import com.qualcotest.api.model.TaskDTO;

import java.util.Date;
import java.util.List;

public interface CountryStatsRepository {

    List<CountryStats> findAll();

    List<TaskDTO> getTaskDTOs(String regionName, Integer yearFrom, Integer yearTo);
}
