package com.example.invit_in.food;

// Repositório responsável pelas operações de acesso ao banco de dados da entidade Food.

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
