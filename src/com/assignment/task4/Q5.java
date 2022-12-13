package com.assignment.task4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows of array");
        int rows= s.nextInt();
        System.out.println("Enter no. of columns of array");
        int columns= s.nextInt();
        int[][] firstArray=new int[rows][columns];
        int[][] secondArray=new int[rows][columns];
        int[][] result=new int[rows][columns];
        System.out.println("Enter the elements of first array row by row");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                firstArray[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of second array row by row");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                secondArray[i][j] = s.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[i][j] = firstArray[i][j]+secondArray[i][j];
            }
        }
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(result[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
