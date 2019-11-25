package com.mrcodekiddie.persons;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.mrcodekiddie.persons.data.Alien;
import com.mrcodekiddie.persons.data.Person;

import java.util.List;

@Dao
public interface DAOAccess {

    @Insert
   Long insertPerson(Person person);

   @Query("select id from person order by id desc")
    int getLastIdNo();

   @Query("select alien_id from alien order by alien_id desc")
    int getLastALienIdNo();


   @Insert
    Long insertAlien(Alien alien);

   @Query("select * from alien where alien_id=:alienID")
   Alien getAlien(int alienID);

}
