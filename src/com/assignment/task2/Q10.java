package com.assignment.task2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int salary;
        double grossSalary;
        System.out.println("Enter the basic salary");
        Scanner s=new Scanner(System.in);
        salary=s.nextInt();
        if(salary<=15000)
        {
            System.out.println("your HRA is 25% and DA is 82%");
            grossSalary=(salary*25/100)+(salary*82/100)+salary;
            System.out.println("your Gross salary is " +grossSalary );
        }
        else if(salary >15000 && salary <=20200)
        {
            System.out.println("your HRA is 27% and DA is 90%");
            grossSalary=(salary*27/100)+(salary*90/100)+salary;
            System.out.println("your Gross salary is " +grossSalary );
        }
        else if(salary>20200)
        {
            System.out.println("your HRA is 36% and DA is 95%");
            grossSalary=(salary*36/100)+(salary*95/100)+salary;
            System.out.println("your Gross salary is " +grossSalary );
        }

        }
    }

