package com.qualcotest.api.repository;

import com.qualcotest.api.model.Region;

import java.util.List;

public interface RegionRepository {
    List<Region> findAll();
}
