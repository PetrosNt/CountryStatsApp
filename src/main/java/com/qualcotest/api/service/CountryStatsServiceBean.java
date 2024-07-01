package com.qualcotest.api.service;

import com.qualcotest.api.model.Country;
import com.qualcotest.api.model.CountryStats;
import com.qualcotest.api.model.TaskDTO;
import com.qualcotest.api.repository.CountryStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CountryStatsServiceBean implements CountryStatsService {
    @Autowired
    private CountryStatsRepository countryStatsRepository;

    @Override
    public List<CountryStats> getCountryStatsWithMaxGdpPerPopulation() {
        List<CountryStats> allCountryStats = countryStatsRepository.findAll();
        Map<Country, Optional<CountryStats>> maxGdpMap= allCountryStats.stream().
                collect(Collectors.groupingBy(
                        CountryStats::getCountry,
                        Collectors.maxBy(Comparator.comparing(this::getGdpOverPopulation))
                ));

        return maxGdpMap.values().stream().filter(Optional::isPresent).map(Optional::get).sorted(Comparator.comparing(cs -> cs.getCountry().getName())).collect(Collectors.toList());

    }

    @Override
    public List<TaskDTO> getTaskDTOs(String regionName, Integer yearFrom, Integer yearTo) {
        return countryStatsRepository.getTaskDTOs(regionName,yearFrom,yearTo);
    }

    private BigDecimal getGdpOverPopulation(CountryStats countryStats) {
        return countryStats.getGdp().divide(BigDecimal.valueOf(countryStats.getPopulation()),RoundingMode.HALF_UP);
    }
}
