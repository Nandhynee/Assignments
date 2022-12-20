package com.assignment.practicequestions;

import java.util.Scanner;

public class Swappingtwonum {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println("Enter the value of a and b");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println(" value of a and b is  "+a+"   "+"and  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped value of a and b is  "+a+"  "+"and  " +b);
    }
}
