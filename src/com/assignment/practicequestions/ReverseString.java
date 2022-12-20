package com.assignment.practicequestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String rstr="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
         rstr=ch+rstr;
        }
        System.out.println("Reversed string " +rstr);
    }
}
