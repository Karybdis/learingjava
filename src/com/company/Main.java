package com.company;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.awt.SunToolkit;

import java.awt.*;
import java.util.*;


public class Main
{
    public static void print()
    {

        for (Student student : Student.students)
        {

            System.out.print(student.getName() + ' ');
            System.out.printf("%d  ",student.getId());
            for (Lesson lesson : student.lessons)
            {
                System.out.print(lesson.getName() + ' ');
                System.out.printf("%d  ",lesson.getGrade());
            }
            System.out.print(student.getAllgrade());
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        int i,j, allgrade = 0,num;
        while (true)
        {
            System.out.println("请输入对应的序号:");       //初始化界面
            System.out.println("--------------------");
            System.out.println("1.学生成绩查询");
            System.out.println("2.退出系统");
            Scanner scanf = new Scanner(System.in);
            num = scanf.nextInt();
            switch (num)
            {

                case 1:                                 //进入成绩查询界面
                    for (i = 0; i < 20; i++)
                        System.out.println("\n");
                    break;
                case 2:                                 //退出程序
                    System.exit(0);

            }
            System.out.println("请输入学生数量");
            int stu_num = scanf.nextInt();
            System.out.println("请输入课程数量");
            int class_num = scanf.nextInt();
            for (i = 0; i < stu_num; i++)
            {
                Student stu = new Student();
                System.out.println("请输入学生姓名");
                stu.setName(scanf.next());
                System.out.println("请输入学生学号");
                stu.setId(scanf.nextInt());
                for (j = 0; j < class_num; j++)
                {
                    Lesson les = new Lesson();
                    System.out.println("请输入课程名字");
                    les.setName(scanf.next());
                    System.out.println("请输入课程分数");
                    les.setGrade(scanf.nextInt());
                    allgrade += les.getGrade();
                    stu.lessons.add(les);
                }
                stu.setAllgrade(allgrade);
                allgrade = 0;
                Student.students.add(stu);

            }
            print();
            while (true)
            {
                System.out.println("请输入对应的序号:");
                System.out.println("--------------------");
                System.out.println("1.按总成绩升序排名");
                System.out.println("2.按总成绩降序排名");
                System.out.println("3.按学号升序排名");
                System.out.println("4.按学号降序排名");
                System.out.println("5.返回主系统");
                num = scanf.nextInt();
                switch (num)
                {
                    case 1:
                        Collections.sort(Student.students, new Comparator<Student>()
                        {
                            @Override
                            public int compare(Student o1, Student o2)
                            {
                                return  Integer.valueOf(o1.getAllgrade()).compareTo(Integer.valueOf(o2.getAllgrade()));
                            }
                        });
                        print();
                        break;
                    case 2:
                        Collections.sort(Student.students, new Comparator<Student>()
                        {
                            @Override
                            public int compare(Student o1, Student o2)
                            {
                                return  Integer.valueOf(o2.getAllgrade()).compareTo(Integer.valueOf(o1.getAllgrade()));
                            }
                        });
                        print();
                        break;
                    case 3:
                        Collections.sort(Student.students, new Comparator<Student>()
                        {
                            @Override
                            public int compare(Student o1, Student o2)
                            {
                                return  Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
                            }
                        });
                        print();
                        break;
                    case 4:
                        Collections.sort(Student.students, new Comparator<Student>()
                        {
                            @Override
                            public int compare(Student o1, Student o2)
                            {
                                return  Integer.valueOf(o2.getId()).compareTo(Integer.valueOf(o1.getId()));
                            }
                        });
                        print();
                        break;
                    case 5:
                        break;
                }
                if (num==5) break;
            }
        }
    }
}
