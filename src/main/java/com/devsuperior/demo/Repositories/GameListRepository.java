package com.devsuperior.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.Entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
