package com.assignment.task2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the value of a ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if(a <= 0) {
            System.out.println("the number is Negative");
        } else {
            System.out.println("the number is Positive");
        }
    }
}


