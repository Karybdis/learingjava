package com.company;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.awt.SunToolkit;

import java.awt.*;
import java.util.*;


public class Main
{
    public static int scanf()
    {
        int num;
        Scanner scanf = new Scanner(System.in);
        while (true)
        {
            String str = scanf.next();
            try
            {
                num = Integer.parseInt(str);
                break;
            }
            catch (Exception e)
            {
                System.out.println("请输入数值!");
            }
        }
        return num;
    }
    public static void main(String[] args)
    {
        int i, j, allgrade = 0, num, stu_num, class_num;
        while (true)
        {
            Print.print_home();
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
            stu_num=scanf();
            System.out.println("请输入课程数量");
            class_num=scanf();
            for (i = 0; i < stu_num; i++)
            {
                Student stu = new Student();
                System.out.println("请输入学生姓名");
                stu.setName(scanf.next());
                System.out.println("请输入学生学号");
                stu.setId(scanf());
                for (j = 0; j < class_num; j++)
                {
                    Lesson les = new Lesson();
                    System.out.println("请输入课程名字");
                    les.setName(scanf.next());
                    System.out.println("请输入课程分数");
                    les.setGrade(scanf());
                    allgrade += les.getGrade();
                    stu.lessons.add(les);
                }
                stu.setAllgrade(allgrade);
                allgrade = 0;
                Student.students.add(stu);

            }
            Print.print_all();
            while (true)
            {
                Print.print_sort();
                num = scanf.nextInt();
                switch (num)
                {
                    case 1:
                        Sort.sort_grade_up();
                        Print.print_all();
                        break;
                    case 2:
                        Sort.sort_grade_down();
                        Print.print_all();
                        break;
                    case 3:
                        Sort.sort_id_up();
                        Print.print_all();
                        break;
                    case 4:
                        Sort.sort_id_down();
                        Print.print_all();
                        break;
                    case 5:
                        break;
                }
                if (num == 5) break;
            }
        }
    }
}
