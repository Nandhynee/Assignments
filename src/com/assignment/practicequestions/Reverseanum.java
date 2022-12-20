package com.assignment.practicequestions;

import java.util.Scanner;

public class Reverseanum {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println(+reverse);
    }
}
