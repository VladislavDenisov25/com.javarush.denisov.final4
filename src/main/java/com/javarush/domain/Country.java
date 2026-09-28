package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity(name = "country")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "code_2")
    private String code2;

    @Column(name = "continent")
    private Integer continent;

    @Column(name = "region")
    private String region;

    @Column(name = "surface_area")
    private Double surfaceArea;

    @Column(name = "indep_year")
    private Integer indepYear;

    @Column(name = "population")
    private Integer population;

    @Column(name = "life_expectancy")
    private Integer lifeExpectancy;

    @Column(name = "gnp")
    private Integer gnp;

    @Column(name = "gnpo_id")
    private Integer gnpoId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToOne
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(mappedBy = "countryId")
    private List<CountryLanguage> languages;

    @OneToMany(mappedBy = "name")
    private List<City> citys;

}
