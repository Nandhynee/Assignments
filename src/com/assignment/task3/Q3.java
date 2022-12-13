package com.assignment.task3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the word");
        Scanner s = new Scanner(System.in);
        str = s.next();
        int length=str.length(),backIndex;
        boolean isPalindrome = true;
        for (int index = 0; index < length; index++) {
            backIndex=length-1-index;
            if(index>=backIndex){
                break;
            }
            if(str.charAt(index)!=str.charAt(backIndex)){
                isPalindrome=false;
            }
        }
        if(isPalindrome){
            System.out.println("The word is palindrome ");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}
