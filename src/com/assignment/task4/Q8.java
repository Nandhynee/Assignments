package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner s = new Scanner(System.in);
        int length= s.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements of array");
        for (int i=0;i<length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length>3){
            System.out.println("Third largest element is "+arr[arr.length-3]);
        } else{
            System.out.println("There are less than 3 elements");
        }

    }
}
