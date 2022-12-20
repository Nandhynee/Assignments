package com.assignment.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first string");
        String firstStr=s.next();
        System.out.println("Enter second string");
        String secondStr=s.next();
        char[] firstChars=firstStr.toLowerCase().toCharArray();
        char[] secondChars=secondStr.toLowerCase().toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        boolean isAnagram= Arrays.equals(firstChars,secondChars);
        if(isAnagram){
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }
}
