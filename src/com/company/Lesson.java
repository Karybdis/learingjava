package com.company;

import java.util.ArrayList;

/**
 * Created by sunsc on 2017/5/14.
 */
public class Lesson
{

    public static ArrayList<Lesson> lessons = new ArrayList<>();
    private String name;
    private int id;

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


}
