package com.company;

import java.util.Collections;
import java.util.Comparator;

public class Sort
{
    public static void sort_grade_up()
    {
        Collections.sort(Student.students, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return Integer.valueOf(o1.getAllgrade()).compareTo(Integer.valueOf(o2.getAllgrade()));
            }
        });
    }

    public static void sort_grade_down()
    {
        Collections.sort(Student.students, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return Integer.valueOf(o2.getAllgrade()).compareTo(Integer.valueOf(o1.getAllgrade()));
            }
        });
    }

    public static void sort_id_up()
    {
        Collections.sort(Student.students, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
            }
        });
    }

    public static void sort_id_down()
    {
        Collections.sort(Student.students, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return Integer.valueOf(o2.getId()).compareTo(Integer.valueOf(o1.getId()));
            }
        });
    }
}
