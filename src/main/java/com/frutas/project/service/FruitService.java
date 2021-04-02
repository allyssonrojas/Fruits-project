package com.frutas.project.service;

import com.frutas.project.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {

    List<Fruit> getAllFruits();
    Optional<Fruit> getFruitsById(String idFruit);
    String saveFruit(Fruit fruit);
    String deleteFruitById(String idFruit);
}
