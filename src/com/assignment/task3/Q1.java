package com.assignment.task3;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int n, c;
        int a = 0;
        int b = 1;
        System.out.println("the fibonacci series");
        System.out.println("Enter the value of n");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <=n-2;i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
