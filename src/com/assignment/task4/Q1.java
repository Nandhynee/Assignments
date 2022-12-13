package com.assignment.task4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements of array");
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("You entered");
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
