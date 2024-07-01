package com.qualcotest.api.repository;

import com.qualcotest.api.model.Continent;
import com.qualcotest.api.model.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RegionRepositoryBean implements RegionRepository{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Region> findAll() {
        TypedQuery<Region> query = entityManager.createQuery("SELECT r FROM Region r", Region.class);
        return query.getResultList();
    }
}
