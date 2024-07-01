package com.qualcotest.api.repository;

import com.qualcotest.api.model.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepositoryBean implements CountryRepository {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Country> getCountries() {
        TypedQuery<Country> query =  entityManager.createQuery("SELECT c FROM Country c ORDER BY c.name", Country.class);
        return query.getResultList();
    }

    @Override
    public Country getCountry(Integer id) {
        TypedQuery<Country> query =  entityManager.createQuery("SELECT c FROM Country c where c.id= :id", Country.class);
        query.setParameter("id", id);
        return query.getResultList().stream().findFirst().orElse(null);
    }
}
