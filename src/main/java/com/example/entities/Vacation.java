package com.example.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
@Entity
@Table(name = "vacations")
@Getter
@Setter
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    @Column(name = "vacation_title")
    private String vacation_title;

    @Column(name = "description")
    private String description;

    @Column(name = "travel_fare_price")
    private BigDecimal travel_price;

    @Column(name = "image_URL")
    private String image_URL;

    @Column(name = "create_date")
    @CreationTimestamp
    Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
    Set<Excursion> excursions;

}

