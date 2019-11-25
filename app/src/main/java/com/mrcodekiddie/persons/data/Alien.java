package com.mrcodekiddie.persons.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity public class Alien {

    @PrimaryKey
    public Integer alien_id;

    public String galaxy;
    public  String planet;

    public Alien(Integer alien_id, String galaxy, String planet) {
        this.alien_id = alien_id;
        this.galaxy = galaxy;
        this.planet = planet;
    }
}
