package com.assignment.task3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Number is not a prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        }
    }
}
