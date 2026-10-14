package com.javarush.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity(name = "country_language")
@Data
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country countryId;

    @Column(name = "language")

    private String language;

    @Column(name = "is_official")
    private Boolean isOfficial;

    @Column(name = "percentage")
    private BigDecimal percentage;
}
