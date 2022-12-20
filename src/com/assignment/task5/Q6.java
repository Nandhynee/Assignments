package com.assignment.task5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        System.out.println("Enter the sub string");
        String subStr=s.next();
        if(str.contains(subStr)){
            System.out.println("Sub string exists in main string");
        } else{
            System.out.println("Sub string does not exist in main string");
        }
    }
}
