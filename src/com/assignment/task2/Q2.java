package com.assignment.task2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println("the character is an alphabet");
        }
        else
        {
            System.out.println("the character is not an alphabet" );

        }



    }
}
