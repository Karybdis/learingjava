package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("请输入对应的序号");
        System.out.println("1.学生成绩查询")；
        System.out.println("2.退出系统");

        Scanner scanf = new Scanner(System.in);
        int num = scanf.nextInt();
        switch (num)
        {

            case 1:

            case 2:
                System.exit(0);


        }
    }
}
