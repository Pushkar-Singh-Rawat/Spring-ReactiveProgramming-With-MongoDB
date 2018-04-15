package com.example.demo.respositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Recipe;

public interface RecipeReactiveRepository  extends ReactiveMongoRepository<Recipe,String>{

}
