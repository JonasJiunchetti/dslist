package com.devsuperior.demo.Entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_game_list")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

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
        GameList other = (GameList) object;
        return Objects.equals(id, other.id);
    }
}
