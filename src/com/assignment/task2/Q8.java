package com.assignment.task2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double income, taxtobepaid;
        System.out.println("enter the income to calculate tax");
        Scanner s = new Scanner(System.in);
        income = s.nextDouble();
        if (income >= 250000 && income < 600000) {
            System.out.println("Your tax is 10%");
            taxtobepaid = income * 10 / 100;
            System.out.println("your final tax is " + taxtobepaid);

        } else if (income >= 600000 && income < 1200000) {
            System.out.println("Your tax is 18%");
            taxtobepaid = income * 18 / 100;
            System.out.println("your final tax is " + taxtobepaid);
        } else if (income >= 1200000) {
            System.out.println("Your tax is 25%");
            taxtobepaid = income * 25 / 100;
            System.out.println("your final tax is " + taxtobepaid);
        } else {
            System.out.println("Your tax is 0");
        }


    }

}

