package com.devsuperior.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}