package com.assignment.task4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements of array");
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter an element to find");
        int element = s.nextInt();
        boolean found =false;
        for (int i=0;i<length;i++){
            if (element==arr[i]){
                System.out.println("Found element");
                found=true;
            }
        }
        if(!found){
            System.out.println("Didn't find element");
        }

    }
}
