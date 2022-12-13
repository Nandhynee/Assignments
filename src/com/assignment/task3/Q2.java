package com.assignment.task3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n = 0, result = 1;
        System.out.println("Enter the value for n");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("the factorial of the number is " + result);
    }
}
