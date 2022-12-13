package com.assignment.task2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while (true) {
            if (a <= 0) {
                System.out.println("ITs Over");
                break;
            } else
                System.out.println("Good Going");
            a = s.nextInt();
        }
    }
}
