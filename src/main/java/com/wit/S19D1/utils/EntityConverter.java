package com.wit.S19D1.utils;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.dto.MovieResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;


import java.util.ArrayList;
import java.util.List;

public class EntityConverter {
    public static ActorResponse actorConverter(Actor actor) {
        return new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName());
    }

    public static List<ActorResponse> actorResponsesConverter(List<Actor> actorList) {
        List<ActorResponse> actorResponsesList = new ArrayList<>();
        for (Actor actor : actorList) {
            ActorResponse actorResponse = new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName());
            actorResponsesList.add(actorResponse);
        }
        return actorResponsesList;
    }

    public static MovieResponse movieConvertor(Movie movie) {
        List<ActorResponse> actorResponseList = new ArrayList<>();
        for (Actor actor : movie.getActorList()) {
            actorResponseList.add(new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName()));
        }
        return new MovieResponse(movie.getId(), movie.getName(), actorResponseList);
    }

    public static List<MovieResponse> movieListConverter(List<Movie> movies) {
        List<MovieResponse> movieResponseList = new ArrayList<>();
        for (Movie movie : movies) {
            List<ActorResponse> actorResponseList = new ArrayList<>();
            for (Actor actor : movie.getActorList()) {
                actorResponseList.add(new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName()));
            }
            movieResponseList.add(new MovieResponse(movie.getId(), movie.getName(), actorResponseList));
        }
        return movieResponseList;


    }

}
