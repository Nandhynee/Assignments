package com.assignment.task3;

public class Q10 {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                for (int t = 0; t <= i; t++) {
                    System.out.print("*");
                }
                for (int k = 8-i*2; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


