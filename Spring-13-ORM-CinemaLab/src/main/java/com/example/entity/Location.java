package com.example.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private String latitude;
    private String longtitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;
}
