package com.wit.S19D1.service;

import com.wit.S19D1.dto.MovieResponse;
import com.wit.S19D1.entity.Actor;
import com.wit.S19D1.entity.Movie;

import java.util.List;

public interface MovieService {
    //[GET]/movies => tüm movie listini dönmeli.
    List<MovieResponse> findAll();

    //[GET]/movies/{id} => İlgili id deki movie objesini dönmeli.
    MovieResponse findById(Long id);

    //[POST]/movies/ => Bir adet movie objesi ve bir adet actor objesi alır ve ikisini de veritabanına ilişkileri ile birlikte kaydeder.
    MovieResponse save(Movie movie, Actor actor);

    //[PUT]/movies/{id} => İlgili id deki movie objesinin değerlerini yeni gelen data ile değiştirir.


    //[DELETE]/movies/{id} => İlgili id değerindeki movie objesini veritabanından siler.
    MovieResponse delete(Long id);
}
