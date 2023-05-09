package com.devsuperior.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.DTO.GameMinDTO;
import com.devsuperior.demo.Services.GameService;

@RestController
@RequestMapping("/games")
public class GameController{

    @Autowired
    private GameService gameService;

    @GetMapping("")
    public List<GameMinDTO>findAll()  {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}