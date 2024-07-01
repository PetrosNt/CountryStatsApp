package com.qualcotest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CountryStatsId {

    private Integer countryId;
    private Integer year;

    public CountryStatsId() {}

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
