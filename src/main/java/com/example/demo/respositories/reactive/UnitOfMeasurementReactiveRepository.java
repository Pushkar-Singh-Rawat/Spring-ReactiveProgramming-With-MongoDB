package com.example.demo.respositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.UnitOfMeasurement;

public interface UnitOfMeasurementReactiveRepository extends ReactiveMongoRepository<UnitOfMeasurement, String> {

}
