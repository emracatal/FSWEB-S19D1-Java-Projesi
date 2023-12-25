package com.wit.S19D1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "movie", schema = "s19d1")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "director_name")
    private String directorName;

    @Column(name = "rating")
    private double rating;

    @Column(name = "release_date")
    private String releaseDate;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "movie_actor", schema = "s19d1",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actorList;

    public void add(Actor actor) {
        if (actor == null) {
            actorList = new ArrayList<>();
        }
        actorList.add(actor);
    }
}
