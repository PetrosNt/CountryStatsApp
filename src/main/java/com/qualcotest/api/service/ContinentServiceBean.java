package com.qualcotest.api.service;

import com.qualcotest.api.model.Continent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qualcotest.api.repository.ContinentRepository;

import java.util.List;

@Service
public class ContinentServiceBean implements ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    @Override
    public List<Continent> getContinents() {
        return continentRepository.getContinents();
    }
}
