package com.company;


import java.util.ArrayList;

public class Student
{
    public static ArrayList<Student> students = new ArrayList<>();
    private String name;
    private String id;
    public  ArrayList<Lesson> lessons = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }


}
