package com.devsuperior.demo.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "tb_game")
@NoArgsConstructor                
@AllArgsConstructor
@Data
public class Game{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;
    
    private String platforms;
    
    private Double score;
    
    private String imgUrl;
    
    private String shortDescription;
    
    private String longDescription;

@Override                               // Override methods here are comparing* objects
public int hashCode(){
    return Objects.hash(id);
}

@Override
public boolean equals(Object object){
        if(this==object)
            return true;
        if(object==null)
            return false;
        if(getClass() != object.getClass())
            return false;
        Game other = (Game) object;
        return Objects.equals(id, other.id);
}

}