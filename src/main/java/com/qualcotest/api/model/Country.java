package com.qualcotest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer id;

    @Column
    private String name;

    @Column
    private String area;

    @Column(name = "national_day")
    private String nationalDay;

    @Column(name = "country_code2")
    private String countryCode2;

    @Column(name = "country_code3")
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;



    public Country(){}

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(String nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
