package com.assignment.task4;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        int[] data=new int[length];
        System.out.println("Enter the elements of array");
        for (int i=0;i<length;i++){
            data[i]=s.nextInt();
        }
        System.out.println("Enter the target sum");
        int sum=s.nextInt();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i != j && (data[i] + data[j] == sum)) {
                    System.out.println(data[i] + "," + data[j]);
                }
            }
        }
    }

}
