package com.wit.S19D1.service;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;
import com.wit.S19D1.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorServiceImpl implements ActorService {
    private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<ActorResponse> findAll() {
        return null;

    }

    @Override
    public ActorResponse findById(Long id) {
        return null;
    }

    @Override
    public ActorResponse save(Actor actor, Movie movie) {
        return null;
    }

    @Override
    public ActorResponse delete(Long id) {
        return null;
    }
}
