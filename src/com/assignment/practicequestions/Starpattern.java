package com.assignment.practicequestions;

public class Starpattern {
    public static void main(String[] args) {
        int i, j, row = 5;
        for (i = 1; i <= row; i++) {
            for (int k = row-i; k > 0; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    }

