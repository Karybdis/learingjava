package com.company;

import java.util.ArrayList;

public class Lesson
{

    public static ArrayList<Lesson> lessons = new ArrayList<>();
    private String name;
    private int grade;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
}
