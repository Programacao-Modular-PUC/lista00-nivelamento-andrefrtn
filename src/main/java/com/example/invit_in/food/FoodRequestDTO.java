package com.example.invit_in.food;

// Representa os dados recebidos na requisição para criar ou atualizar um Food.

public record FoodRequestDTO(String title, String image, Integer price) {

}
