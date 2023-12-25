package com.wit.S19D1.service;

import com.wit.S19D1.dto.MovieResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService{
    @Override
    public List<MovieResponse> findAll() {
        return null;
    }

    @Override
    public MovieResponse findById(Long id) {
        return null;
    }

    @Override
    public MovieResponse save(Movie movie, Actor actor) {
        return null;
    }

    @Override
    public MovieResponse delete(Long id) {
        return null;
    }
}
