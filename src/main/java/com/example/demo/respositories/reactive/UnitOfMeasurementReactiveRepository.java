package com.example.demo.respositories.reactive;

import java.util.Optional;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.UnitOfMeasurement;

import reactor.core.publisher.Mono;

public interface UnitOfMeasurementReactiveRepository extends ReactiveMongoRepository<UnitOfMeasurement, String> {
	Mono<UnitOfMeasurement> findByDescription(String description);
}
