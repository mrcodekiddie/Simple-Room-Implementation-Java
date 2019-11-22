package com.mrcodekiddie.persons.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mrcodekiddie.persons.DAOAccess;

@Database(entities = {Person.class},version = 1,exportSchema = false)
public abstract  class PersonDatabase extends RoomDatabase
{
    public  abstract DAOAccess daoAccess();

}
