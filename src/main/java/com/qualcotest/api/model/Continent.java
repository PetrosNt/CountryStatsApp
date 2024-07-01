package com.qualcotest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name="continents")
public class Continent {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="continent_id")
    private Integer id;

    @Column
    private String name;

    public Continent() {}

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
}
