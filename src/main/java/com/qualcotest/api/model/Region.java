package com.qualcotest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="region_id")
    private Integer id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name="continent_id")
    private Continent continent;

    public Region() {

    }

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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
