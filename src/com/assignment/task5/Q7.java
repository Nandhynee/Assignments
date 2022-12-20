package com.assignment.task5;


import java.util.Scanner;

public class Q7 {
    public static boolean checkWordIsAnIsogram(String word) {
        if(word == null)
            return false;
        word = word.toLowerCase();
        char[] arr = word.toCharArray();
        for (char ch : arr) {
            if(word.indexOf(ch) != word.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Enter a string ");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        boolean result = checkWordIsAnIsogram(str);
        if(result == true) {
            System.out.println(str + " is an Isogram");
        }
        else {
            System.out.println(str + " NOT an Isogram");
        }
    }
}


