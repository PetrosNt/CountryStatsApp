package com.qualcotest.api.repository;

import com.qualcotest.api.model.CountryStats;
import com.qualcotest.api.model.Region;
import com.qualcotest.api.model.TaskDTO;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CountryStatsRepositoryBean implements CountryStatsRepository {
    @Autowired
    EntityManager entityManager;

    @Override
    public List<CountryStats> findAll() {
        TypedQuery<CountryStats> query = entityManager.createQuery("SELECT c FROM CountryStats c", CountryStats.class);
        return query.getResultList();
    }

    @Override
    public List<TaskDTO> getTaskDTOs(String regionName, Integer yearFrom, Integer yearTo) {
        String statement = "SELECT cs FROM CountryStats cs " +
                "where " +
                (regionName==null || StringUtils.isEmpty(regionName) ? " " : "cs.country.region.name=:regionName and ")+
                (yearFrom==null ? " " : "cs.year>=:yearFrom and ")+
                (yearTo==null ? " " : "cs.year<:yearTo and ")+
                "true";
        TypedQuery<CountryStats> query = entityManager.createQuery(statement, CountryStats.class);
        if(regionName!=null && !StringUtils.isEmpty(regionName)) query.setParameter("regionName", regionName);
        if(yearFrom!=null) query.setParameter("yearFrom", yearFrom);
        if(yearTo!=null) query.setParameter("yearTo", yearTo);
        return query.getResultList().stream().map(cs->getTaskDTO(cs)).collect(Collectors.toList());
    }

    TaskDTO getTaskDTO(CountryStats cs){
        return new TaskDTO(cs.getCountry().getRegion().getContinent().getName(),
                cs.getCountry().getRegion().getName(),
                cs.getCountry().getName(),
                cs.getYear(),
                cs.getPopulation(),
                cs.getGdp());
    }


}
