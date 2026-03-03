package com.example.invit_in.controller;

// Controller responsável por expor os endpoints da API de Food.
// Gerencia requisições HTTP para criação e listagem de alimentos.


import com.example.invit_in.food.Food;
import com.example.invit_in.food.FoodRepository;
import com.example.invit_in.food.FoodRequestDTO;
import com.example.invit_in.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){

        Food foodData = new Food(data);
        repository.save(foodData);
        return;

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){


    List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;
    }


}
