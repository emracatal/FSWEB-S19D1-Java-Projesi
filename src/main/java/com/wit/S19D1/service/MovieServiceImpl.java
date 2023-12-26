package com.wit.S19D1.service;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.dto.MovieResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;
import com.wit.S19D1.exceptions.CinemaException;
import com.wit.S19D1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieResponse> findAll() {
        return null;
    }

    @Override
    public MovieResponse findById(Long id) {
        Optional<Movie> optional= movieRepository.findById(id);
        if(optional.isPresent()){
            Movie foundMovie=optional.get();
            return new MovieResponse(foundMovie.getId(), foundMovie.getName());
        }
        throw new CinemaException(("Given id is not exist " + id), HttpStatus.NOT_FOUND);
    }

    @Override
    public MovieResponse save(Movie movie) {
        return null;
    }

    @Override
    public MovieResponse delete(Long id) {
        return null;
    }
}
