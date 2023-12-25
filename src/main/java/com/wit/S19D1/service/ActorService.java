package com.wit.S19D1.service;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.dto.MovieResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;

import java.util.List;

public interface ActorService {
    //[GET]/actors => tüm actors listini dönmeli.
    List<ActorResponse> findAll();

    //[GET]/actors/{id} => İlgili id deki actor objesini dönmeli.
    ActorResponse findById(Long id);

    //[POST]/actors => Bir adet movie objesi ve bir adet actor objesi alır ve ikisini de veritabanına ilişkileri ile birlikte kaydeder.
    ActorResponse save(Actor actor, Movie movie);

    //[PUT]/actors/{id} => İlgili id deki actor objesinin değerlerini yeni gelen data ile değiştirir.


    //[DELETE]/actors/{id} => İlgili id değerindeki actor objesini veritabanından siler.
    ActorResponse delete(Long id);
}
