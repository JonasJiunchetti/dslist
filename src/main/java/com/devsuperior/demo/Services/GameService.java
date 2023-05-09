package com.devsuperior.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.DTO.GameMinDTO;
import com.devsuperior.demo.Entities.Game;
import com.devsuperior.demo.Repositories.GameRepository;

@Service
public class GameService    {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll()   {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}