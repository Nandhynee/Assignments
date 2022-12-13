package com.assignment.task2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%4==0){
            if(a%100==0 ){
                if(a%400==0) {
                    System.out.println("The year is leap year");
                } else {
                    System.out.println("The year is not a leap year");
                }
            } else {
                System.out.println("The year is leap year");
            }
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
