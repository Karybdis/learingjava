package com.company;


import java.util.ArrayList;

public class Student
{
    public static ArrayList<Student> students = new ArrayList<>();
    private String name;
    private int id;
    public ArrayList<Lesson> lessons = new ArrayList<>();
    private int allgrade;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getAllgrade()
    {
        return allgrade;
    }

    public void setAllgrade(int allgrade)
    {
        this.allgrade = allgrade;
    }


}
