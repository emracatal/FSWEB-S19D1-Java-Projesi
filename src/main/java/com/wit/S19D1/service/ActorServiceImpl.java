package com.wit.S19D1.service;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;
import com.wit.S19D1.exceptions.CinemaException;
import com.wit.S19D1.repository.ActorRepository;
import com.wit.S19D1.utils.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {
    private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<ActorResponse> findAll() {
        return EntityConverter.actorResponsesConverter(actorRepository.findAll());
    }

    @Override
    public ActorResponse findById(Long id) {
        Optional<Actor> optional= actorRepository.findById(id);
        if(optional.isPresent()){
            Actor foundActor=optional.get();
            return new ActorResponse(foundActor.getId(), foundActor.getFirstName(),foundActor.getLastName());
        }
        throw new CinemaException(("Given id is not exist " + id), HttpStatus.NOT_FOUND);
    }

    @Override
    public ActorResponse save(Actor actor, Movie movie) {
        return null;
    }

    @Override
    public ActorResponse delete(Long id) {
        ActorResponse toBeRemovedStudentResponse=findById(id);
        actorRepository.deleteById(toBeRemovedStudentResponse.id());
        return toBeRemovedStudentResponse;
    }
}
