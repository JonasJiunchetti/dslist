package com.devsuperior.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.DTO.GameListDTO;
import com.devsuperior.demo.DTO.GameMinDTO;
import com.devsuperior.demo.Services.GameListService;
import com.devsuperior.demo.Services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping("")
    public List<GameListDTO>findAll()  {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO>findAll(@PathVariable Long listId)  {
        List<GameMinDTO> result = gameService.findbyList(listId);
        return result;
    }
}
