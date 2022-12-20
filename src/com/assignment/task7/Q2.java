package com.assignment.task7;

public class Q2 {
        public static void main(String args[]) {
            int Array1[] = {36, 23, 80, 73, 55};
            int Array2[] = {68, 15, 121, 73, 36};
            System.out.println("Intersection of the two arrays is ");
            for(int i = 0; i<Array1.length; i++ ) {
                for(int j = 0; j<Array2.length; j++) {
                    if(Array1[i]==Array2[j]) {
                        System.out.println(Array2[j]);
                    }
                }
            }
        }
    }

