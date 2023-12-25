package com.wit.S19D1.controller;

import com.wit.S19D1.dto.ActorResponse;
import com.wit.S19D1.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {
    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/")
    public List<ActorResponse> findAll(){
        return actorService.findAll();
    }

    @DeleteMapping("/{id}")
    public ActorResponse delete(@PathVariable Long id) {
        return actorService.delete(id);
    }
}
