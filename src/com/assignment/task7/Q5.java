package com.assignment.task7;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

