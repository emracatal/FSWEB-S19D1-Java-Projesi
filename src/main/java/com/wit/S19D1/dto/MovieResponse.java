package com.wit.S19D1.dto;

import java.util.List;

public record MovieResponse(Long id, String name, List<ActorResponse> actors) {
}
