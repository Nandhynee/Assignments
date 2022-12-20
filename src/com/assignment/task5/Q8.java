package com.assignment.task5;

import java.util.Scanner;
import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the string");
        String braces=scanner.next();
        if(balanceBraceCheck(braces)){
            System.out.println("True, Valid braces ");
        } else {
            System.out.println("False, invalid braces");
        }

    }

    public static boolean balanceBraceCheck(String str){
        Stack<Character> characterStack  = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                characterStack.push(c);
            } else if(c == ']') {
                if(characterStack.isEmpty() || characterStack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(characterStack.isEmpty() || characterStack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(characterStack.isEmpty() || characterStack.pop() != '{') {
                    return false;
                }
            }

        }
        return characterStack.isEmpty();
    }
}
