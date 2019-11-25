package com.mrcodekiddie.persons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Dao;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.graphics.CornerPathEffect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.mrcodekiddie.persons.data.Alien;
import com.mrcodekiddie.persons.data.Person;
import com.mrcodekiddie.persons.data.PersonDatabase;

import java.io.File;

import kotlinx.coroutines.CoroutineScope;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DAOAccess dao=PersonDatabase.getPersonDatabase(this).daoAccess();


        final Person person = new Person(dao.getLastIdNo()+1,"mmm", "989");

        Long instertStatus=dao.insertPerson(person);

        Log.v("DB_Operation_inserted",instertStatus.toString());

        final Alien alien=new Alien(dao.getLastALienIdNo()+1,"andromeda","earth C134");

        Log.v("Alien inserted", String.valueOf(dao.insertAlien(alien)));

        Toast.makeText(this, dao.getAlien(11).galaxy, Toast.LENGTH_SHORT).show();
 

    }

}