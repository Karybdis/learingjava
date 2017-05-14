package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int i;
        System.out.println("请输入对应的序号:");
        System.out.println("--------------------");
        System.out.println("1.学生成绩查询");
        System.out.println("2.退出系统");

        Scanner scanf = new Scanner(System.in);
        int num = scanf.nextInt();
        switch (num)
        {

            case 1:
                for ( i = 0; i < 20; i++)
                    System.out.println("\n");
                break;
            case 2:
                System.exit(0);

        }
        System.out.println("请输入学生数量");
        int stu_num = scanf.nextInt();
        System.out.println("请输入课程数量");
        int class_num = scanf.nextInt();
        for (i = 0; i < stu_num; i++)
        {
            Student stu=new Student();
            System.out.println("请输入学生姓名");
            stu.setName(scanf.next());
            System.out.println("请输入学生学号");
            stu.setId(scanf.nextInt());
            Student.students.add(stu);
            for (int j = 0; j < class_num; j++)
            {
                Lesson les=new Lesson();
                System.out.println("请输入课程名字");
                les.setName(scanf.next());
                System.out.println("请输入课程分数");
                les.setId(scanf.nextInt());
                Lesson.lessons.add(les);
            }
        }
    }
}
