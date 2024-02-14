package com.example.entity;

import com.example.enums.MovieState;
import com.example.enums.MovieType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private Integer duration;
    private String summary;

    @ManyToOne
    private MovieCinema movieCinema;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel", joinColumns = @JoinColumn(name = "m_id"),
    inverseJoinColumns = @JoinColumn (name = "g_id"))
    private List<Genre> genreList;




}
