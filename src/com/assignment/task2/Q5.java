package com.assignment.task2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the percentage");
        Scanner s = new Scanner(System.in);
        int percentage = s.nextInt();
        while(percentage>=0) {

            if (percentage >= 65 && percentage <= 74) {
                System.out.println("your grade is C");

            } else if (percentage >= 75 && percentage <= 89) {
                System.out.println("your grade is B");
            } else if (percentage >= 90 && percentage <=100) {
                System.out.println("your grade is A");
            } else {
                System.out.println("FAIL or Invalid Percentage");
            }
            percentage=s.nextInt();
        }
    }

}
