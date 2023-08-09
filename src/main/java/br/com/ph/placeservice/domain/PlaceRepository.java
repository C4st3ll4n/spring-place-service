package br.com.ph.placeservice.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface PlaceRepository extends ReactiveCrudRepository<Place, UUID>, ReactiveQueryByExampleExecutor<Place>, R2dbcRepository<Place, UUID> {
}
