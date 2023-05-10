package com.devsuperior.demo.DTO;

import org.springframework.beans.BeanUtils;

import com.devsuperior.demo.Entities.Game;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GameDTO {
    
    private Long id;

    private String title;

    private Integer year;

    private String genre;
    
    private String platforms;
    
    private Double score;
    
    private String imgUrl;
    
    private String shortDescription;
    
    private String longDescription;

    public GameDTO(Game entity){
        
        BeanUtils.copyProperties(entity, this);         //copy from entity to this*(object) getters and setters needed
    }

}
