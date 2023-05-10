package com.devsuperior.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.DTO.GameListDTO;
import com.devsuperior.demo.Services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping("")
    public List<GameListDTO>findAll()  {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
