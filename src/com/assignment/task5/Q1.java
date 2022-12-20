package com.assignment.task5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuilder stringBuilder = new StringBuilder(str);
        str= String.valueOf(stringBuilder.reverse());
        System.out.println("Reversed string " +str);

    }
}


