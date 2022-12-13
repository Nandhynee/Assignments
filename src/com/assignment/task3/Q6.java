package com.assignment.task3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int x,y,sum;
        String response;

        Scanner s=new Scanner(System.in);
        do {
            System.out.println("Enter the value of X ");
            System.out.println("Enter the value of Y ");
            x = s.nextInt();
            y = s.nextInt();
            sum = x + y;

            System.out.println("the sum of two numbers is " + sum);
            System.out.println("Do you want to perform the operation again?(yes or no)");
            response=s.next();
        }while ("yes".equalsIgnoreCase(response));

    }
}
