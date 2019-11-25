package com.mrcodekiddie.persons.data;

import android.content.Context;
import android.os.Environment;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.mrcodekiddie.persons.DAOAccess;

import java.io.File;

@Database(entities = {Person.class, Alien.class},version = 2,exportSchema = false)
public abstract  class PersonDatabase extends RoomDatabase

{
    private static PersonDatabase INSTANCE;
    private static String DATABASE_NAME="persons.db";

    public  abstract DAOAccess daoAccess();

    public static PersonDatabase getPersonDatabase(Context context)
    {
        if(INSTANCE==null)
        {
            INSTANCE = Room.databaseBuilder(context, PersonDatabase.class, Environment.getExternalStorageDirectory() + File.separator + "persons" + File.separator + DATABASE_NAME).allowMainThreadQueries().build();
        }

        return INSTANCE;
    }

    public static void destryInstance()
    {
        INSTANCE=null;
    }

}
