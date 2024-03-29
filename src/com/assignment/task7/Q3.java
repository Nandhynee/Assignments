package com.assignment.task7;

import java.util.Scanner;

public class Q3 {
    boolean uniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }

    public static void main(String args[]) {
        Q3 obj = new Q3();
        System.out.println("Enter a string :");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }
}

