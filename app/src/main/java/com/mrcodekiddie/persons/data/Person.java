package com.mrcodekiddie.persons.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity public class Person
{
    @PrimaryKey
    public Integer id;

    public String name;
    public String mobile;

    public Person(Integer id,String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
        this.id = id;

    }
}
