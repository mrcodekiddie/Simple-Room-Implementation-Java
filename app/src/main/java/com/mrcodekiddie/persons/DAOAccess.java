package com.mrcodekiddie.persons;

import androidx.room.Dao;
import androidx.room.Insert;

import com.mrcodekiddie.persons.data.Person;

@Dao
public interface DAOAccess {

    @Insert
   Long insertPerson(Person person);

   


}
