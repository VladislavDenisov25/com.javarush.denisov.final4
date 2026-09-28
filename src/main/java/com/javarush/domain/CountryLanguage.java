package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "country_language")
@Data
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Country countryId;

    @Column(name = "language")
    private String language;

    @Column(name = "is_official")
    private boolean isOfficial;

    @Column(name = "percentage")
    private Integer percentage;
}
