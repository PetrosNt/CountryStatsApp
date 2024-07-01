package com.qualcotest.api.repository;

import com.qualcotest.api.model.Continent;

import java.util.List;

public interface ContinentRepository {
    List<Continent> getContinents();

    Continent getContinent(String name);
}
