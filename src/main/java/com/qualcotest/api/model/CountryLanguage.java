package com.qualcotest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name="country_languages")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @MapsId("countryId")
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @MapsId("languageId")
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Column
    private Boolean official;

    public CountryLanguage() {}

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }
}
