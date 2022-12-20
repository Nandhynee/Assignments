package com.assignment.task5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        System.out.println("Enter the character to count");
        char charToFind=s.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(charToFind==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Total count is "+count);
    }
}
