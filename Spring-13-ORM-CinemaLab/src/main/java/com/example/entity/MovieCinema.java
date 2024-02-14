package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movieCinemas")
@NoArgsConstructor
@Data
public class MovieCinema extends BaseEntity{

    @ManyToOne (fetch = FetchType.LAZY)
    private Movie movie;

    @ManyToOne (fetch = FetchType.LAZY)
    private Cinema cinema;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;


}
