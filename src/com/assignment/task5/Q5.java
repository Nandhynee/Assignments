package com.assignment.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        List<Character> vowels=new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int vowelsCount=0,consonantsCount=0;
        for(int i=0;i<str.length();i++){
            if(vowels.contains(str.charAt(i))){
                vowelsCount++;
            } else if (!vowels.contains(str.charAt(i)) && Character.isAlphabetic(str.charAt(i))){
                consonantsCount++;
            }
        }
        System.out.println("Vowels count is " + vowelsCount);
        System.out.println("Consonants count is " + consonantsCount);
    }
}
