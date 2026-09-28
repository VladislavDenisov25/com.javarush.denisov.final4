package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ValueGenerationType;

@Entity(name = "city")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

   @ManyToOne
   @JoinColumn(name = "country_id")
    private Country countryId;

    @Column(name = "district")
    private String district;

    @Column(name = "population")
    private Integer population;

}
