package br.com.ph.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface PlaceRepository extends ReactiveCrudRepository<Place, UUID> {
}
