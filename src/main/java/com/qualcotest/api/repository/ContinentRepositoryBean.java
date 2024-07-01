package com.qualcotest.api.repository;

import com.qualcotest.api.model.Continent;
import com.qualcotest.api.model.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContinentRepositoryBean implements ContinentRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Continent> getContinents() {
        TypedQuery<Continent> query = entityManager.createQuery("SELECT c FROM Continent c", Continent.class);
        return query.getResultList();

    }

    @Override
    public Continent getContinent(String name) {
        return null;
    }
}
