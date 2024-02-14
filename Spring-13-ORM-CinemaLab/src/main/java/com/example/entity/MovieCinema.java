package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "movieCinemas")
@NoArgsConstructor
@Data
public class MovieCinema extends BaseEntity{

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Cinema cinema;


}
