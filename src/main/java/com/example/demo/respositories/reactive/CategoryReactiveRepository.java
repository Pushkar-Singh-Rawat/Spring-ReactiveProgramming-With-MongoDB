package com.example.demo.respositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Category;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String>{

}
