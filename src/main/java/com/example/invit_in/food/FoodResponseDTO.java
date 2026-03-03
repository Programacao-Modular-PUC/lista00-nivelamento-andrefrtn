package com.example.invit_in.food;

// Representa os dados de Food que serão enviados na resposta da API.
// Recebe a entidade Food e transforma nos campos necessários para o retorno.



public record FoodResponseDTO(long id, String title, String image, Integer price  ) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(),food.getPrice());
    }
}
