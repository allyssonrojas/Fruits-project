package com.frutas.project.repository;

import com.frutas.project.model.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FruitRepository extends MongoRepository<Fruit, String> {
}
