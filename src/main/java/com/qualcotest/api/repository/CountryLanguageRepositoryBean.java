package com.qualcotest.api.repository;

import com.qualcotest.api.model.CountryLanguage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryLanguageRepositoryBean implements CountryLanguageRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<CountryLanguage> findByCountryId(Integer countryId) {
        Query query = entityManager.createQuery("SELECT cl FROM CountryLanguage cl WHERE cl.country.id = :countryId", CountryLanguage.class);
        query.setParameter("countryId", countryId);
        return query.getResultList();
    }
}
