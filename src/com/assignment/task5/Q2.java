package com.assignment.task5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverseString="";
        StringBuilder stringBuilder = new StringBuilder();
        String[] splitStrings= str.split(" ");
        for (int i=0;i<splitStrings.length;i++){
            stringBuilder.append(splitStrings[i]);
            reverseString=reverseString+stringBuilder.reverse();
            reverseString=reverseString+" ";
            stringBuilder.setLength(0);
        }
        reverseString=reverseString.trim();
        System.out.println("Reversed string " +reverseString);

    }
}
