package com.assignment.task2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the value to be divided");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter the value to divide");
        b=s.nextInt();
        int quotient=a/b;
        int remainder=a%b;
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is "+remainder);
    }
}
