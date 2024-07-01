package com.qualcotest.api.service;

import com.qualcotest.api.model.Region;
import com.qualcotest.api.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceBean implements RegionService{
    @Autowired
    RegionRepository regionRepository;

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }
}
