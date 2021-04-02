package com.frutas.project.service.implementation;

import com.frutas.project.model.Fruit;
import com.frutas.project.repository.FruitRepository;
import com.frutas.project.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FruitServiceImplementation implements FruitService {
    @Autowired
    FruitRepository fruitRepository;

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public Optional<Fruit> getFruitsById(String idFruit) {
        return fruitRepository.findById(idFruit);
    }

    @Override
    public String saveFruit(Fruit fruit) {
        fruitRepository.save(fruit);
        return "Fruit was saved";
    }

    @Override
    public String deleteFruitById(String idFruit) {
        fruitRepository.deleteById(idFruit);
        return "Fruit was delete";
    }


}
