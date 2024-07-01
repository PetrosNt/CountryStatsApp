package com.qualcotest.api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="country_stats")
public class CountryStats {

    @EmbeddedId
    private CountryStatsId id;

    @MapsId("countryId")
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(insertable=false, updatable=false)
    private Integer year;

    @Column
    private Integer population;

    @Column
    private BigDecimal gdp;

    public CountryStats() {}

    public CountryStatsId getId() {
        return id;
    }

    public void setId(CountryStatsId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }
}
