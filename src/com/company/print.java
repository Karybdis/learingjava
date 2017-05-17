package com.company;


public class Print
{
    public static void print_home()
    {
        System.out.println("请输入对应的序号:");       //初始化界面
        System.out.println("--------------------");
        System.out.println("1.学生成绩查询");
        System.out.println("2.退出系统");
    }

    public static void print_sort()
    {
        System.out.println("请输入对应的序号:");
        System.out.println("--------------------");
        System.out.println("1.按总成绩升序排名");
        System.out.println("2.按总成绩降序排名");
        System.out.println("3.按学号升序排名");
        System.out.println("4.按学号降序排名");
        System.out.println("5.返回主系统");
    }

    public static void print_all()
    {

        for (Student student : Student.students)
        {

            System.out.print(student.getName() + ' ');
            System.out.printf("%d  ", student.getId());
            for (Lesson lesson : student.lessons)
            {
                System.out.print(lesson.getName() + ' ');
                System.out.printf("%d  ", lesson.getGrade());
            }
            System.out.print(student.getAllgrade());
            System.out.print("\n");
        }
    }
}
