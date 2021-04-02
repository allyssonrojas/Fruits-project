package com.frutas.project.controller;

import com.frutas.project.model.Fruit;
import com.frutas.project.service.implementation.FruitServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    FruitServiceImplementation fruitServiceImplementation;

    @GetMapping
    public List<Fruit> getAllFruits(){
        return fruitServiceImplementation.getAllFruits();
    }

    @GetMapping("/{idFruit}")
    public Optional<Fruit> getFruitsById(@PathVariable String idFruit){
        return fruitServiceImplementation.getFruitsById(idFruit);
    }

    @PostMapping
    public String saveFruits(@RequestBody Fruit fruit){
        return fruitServiceImplementation.saveFruit(fruit);
    }

    @DeleteMapping("/{idFruit}")
    public String deleteFruitById(@PathVariable String idFruit){
        return fruitServiceImplementation.deleteFruitById(idFruit);
    }



}
