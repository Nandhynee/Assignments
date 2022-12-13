package com.assignment.task1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        double r;
        System.out.println("Enter the value of Radius");
        Scanner s=new Scanner(System.in);
        r=s.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of the circle is "+area);

    }
}
