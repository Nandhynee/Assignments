package com.assignment.task1;



public class Question3 {
    public static void main(String[] args) {
        System.out.println(" using third variable");
        int a=10;
        int b=20;
        System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        int c=b;
        b=a;
        a=c;
        System.out.println("Swapped value of a " + a);
        System.out.println("Swapped value of b " + b);
        System.out.println("without using third variable");
        int d=10;
        int e=20;
        System.out.println("the value of d " + d);
        System.out.println("the value of e " + e);
        d=d+e; //50
        e=d-e; //30 (d+e)-e = d
        d=d-e;//50-30 (d+e)-d =e
        System.out.println("Swapped value of d " + d);
        System.out.println("Swapped value of e " + e);
    }
}
