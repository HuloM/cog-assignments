package com.example.onetoonedemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long passportId;
    private String passportNumber;
    private String passportCountry;
    @OneToOne(fetch = FetchType.LAZY,   cascade = CascadeType.ALL, mappedBy ="passport" )
    private Person person;
}
