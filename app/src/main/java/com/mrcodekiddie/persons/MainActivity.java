package com.mrcodekiddie.persons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.graphics.CornerPathEffect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.mrcodekiddie.persons.data.Person;
import com.mrcodekiddie.persons.data.PersonDatabase;

import java.io.File;

import kotlinx.coroutines.CoroutineScope;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PersonDatabase personDatabase = Room.databaseBuilder(this,PersonDatabase.class,Environment.getExternalStorageDirectory() + File.separator + "vanX" + File.separator + "persons.db").build();

        final Person person = new Person(12,"mmm", "989");
new AsyncTask<Void,Void,Void>()
{

    @Override
    protected Void doInBackground(Void... voids) {

        Long status=personDatabase.daoAccess().insertPerson(person);
        Log.d("jumba",status.toString());

        return null;
    }
}.execute();

 

    }

}