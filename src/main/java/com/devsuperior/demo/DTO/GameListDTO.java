package com.devsuperior.demo.DTO;

import com.devsuperior.demo.Entities.GameList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDTO {
    
    private Long id;

    private String name;


    public GameListDTO(GameList entity){
        
        id = entity.getId();
        name = entity.getName();

    }
}
