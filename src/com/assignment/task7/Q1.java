package com.assignment.task7;

import java.util.Scanner;

public class Q1 {
    public static void main(String args[])
    {
        System.out.println("Enter a string to find the non repeating character");
        Scanner s=new Scanner(System.in);
        String iStr=s.next();
        boolean flag = true;

        for(char i :iStr.toCharArray())
        {
            if (iStr.indexOf(i) == iStr.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }
}

