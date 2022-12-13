package com.assignment.task4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements of array");
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        for (int i=0;i<length;i++){
            sum=sum+arr[i];
        }
        int average= sum/length;
        System.out.println("Average is "+average);
    }
}
